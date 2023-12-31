/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.calculation.library;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.PatientIdentifier;
import org.openmrs.PatientIdentifierType;
import org.openmrs.Program;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.calculation.patient.PatientCalculationContext;
import org.openmrs.calculation.result.CalculationResultMap;
import org.openmrs.module.kenyacore.calculation.AbstractPatientCalculation;
import org.openmrs.module.kenyacore.calculation.BooleanResult;
import org.openmrs.module.kenyacore.calculation.Filters;
import org.openmrs.module.kenyaemr.metadata.CommonMetadata;
import org.openmrs.module.kenyaemr.metadata.HivMetadata;
import org.openmrs.module.metadatadeploy.MetadataUtils;

/**
 * Calculation for Missing the NUPI identifier report
 */
public class MissingNUPIIdentifierCalculation extends AbstractPatientCalculation {
    protected static final Log log = LogFactory.getLog(MissingNUPIIdentifierCalculation.class);

    @Override
    public CalculationResultMap evaluate(Collection<Integer> cohort, Map<String, Object> params, PatientCalculationContext context) {

        Program hivProgram = MetadataUtils.existing(Program.class, HivMetadata._Program.HIV);

        // Only people who are alive
        Set<Integer> alive = Filters.alive(cohort, context);

        //Only people on HIV program
        Set<Integer> inHivProgram = Filters.inProgram(hivProgram, alive, context);

        CalculationResultMap ret = new CalculationResultMap();

        for (Integer ptId : inHivProgram) {
            boolean missingNUPIIdentifier = true;
            PatientService patientService = Context.getPatientService();

            PatientIdentifierType nationalUniquePatientIdentifier = MetadataUtils.existing(PatientIdentifierType.class, CommonMetadata._PatientIdentifierType.NATIONAL_UNIQUE_PATIENT_IDENTIFIER);

            List<PatientIdentifier> patientRegIdentifier = patientService.getPatientIdentifiers(null, Arrays.asList(nationalUniquePatientIdentifier), null, Arrays.asList(patientService.getPatient(ptId)), false);

            // Is patient alive and in the HIV program and doesnt have a UPI number
            if (patientRegIdentifier.size() > 0) {
                missingNUPIIdentifier = false;
            }
            ret.put(ptId, new BooleanResult(missingNUPIIdentifier, this, context));
        }
        return ret;
    }
}