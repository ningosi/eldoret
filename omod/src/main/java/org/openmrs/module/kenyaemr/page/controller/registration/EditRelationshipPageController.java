/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.page.controller.registration;

import org.openmrs.Relationship;
import org.openmrs.module.kenyaemr.EmrConstants;
import org.openmrs.module.kenyaui.annotation.SharedPage;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for relationship edit page
 */
@SharedPage({EmrConstants.APP_REGISTRATION, EmrConstants.APP_INTAKE, EmrConstants.APP_CLINICIAN, EmrConstants.APP_HIV_TESTING, EmrConstants.APP_PREP})
public class EditRelationshipPageController {

	public void controller(@RequestParam(value = "relationshipId", required = false) Relationship relationship,
						   @RequestParam(value = "providerId", required = false) String providerId,
						    @RequestParam("returnUrl") String returnUrl,
						   PageModel model) {

		model.addAttribute("relationship", relationship);
		model.addAttribute("providerId", providerId);
		model.addAttribute("returnUrl", returnUrl);
	}
}