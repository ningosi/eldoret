/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.page.controller.adherenceCounselling;

import org.openmrs.Patient;
import org.openmrs.module.kenyaemr.EmrConstants;
import org.openmrs.module.kenyaemr.EmrWebConstants;
import org.openmrs.module.kenyaui.annotation.AppPage;
import org.openmrs.ui.framework.SimpleObject;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.ui.framework.page.PageModel;

/**
 * Homepage for the adherence counseling app
 */
@AppPage(EmrConstants.APP_ADHERENCE_COUNSELOR)
public class CounsellingHomePageController {

	public String controller(UiUtils ui, PageModel model) {

		Patient patient = (Patient) model.getAttribute(EmrWebConstants.MODEL_ATTR_CURRENT_PATIENT);

		if (patient != null) {
			return "redirect:" + ui.pageLink(EmrConstants.MODULE_ID, "adherenceCounselling/counsellingViewPatient", SimpleObject.create("patientId", patient.getId()));
		} else {
			return null;
		}
	}
}