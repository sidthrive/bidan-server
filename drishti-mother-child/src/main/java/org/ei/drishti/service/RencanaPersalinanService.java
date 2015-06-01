package org.ei.drishti.service;

import static org.ei.drishti.common.AllConstants.CommonFormFields.SUBMISSION_DATE_FIELD_NAME;
import static org.ei.drishti.common.AllConstants.FamilyPlanningFormFields.CURRENT_FP_METHOD_FIELD_NAME;
import static org.ei.drishti.common.AllConstants.FamilyPlanningFormFields.DMPA_INJECTION_DATE_FIELD_NAME;
import static org.ei.drishti.common.AllConstants.FamilyPlanningFormFields.FP_METHOD_CHANGE_DATE_FIELD_NAME;
import static org.ei.drishti.common.AllConstants.FamilyPlanningFormFields.NUMBER_OF_CONDOMS_SUPPLIED_FIELD_NAME;
import static org.ei.drishti.common.AllConstants.FamilyPlanningFormFields.NUMBER_OF_OCP_STRIPS_SUPPLIED_FIELD_NAME;
import static org.ei.drishti.common.AllConstants.FamilyPlanningFormFields.OCP_REFILL_DATE_FIELD_NAME;

import java.util.List;

import org.ei.drishti.domain.EligibleCouple;
import org.ei.drishti.domain.FPProductInformation;
import org.ei.drishti.domain.RencanaPersalinan;
import org.ei.drishti.form.domain.FormSubmission;
import org.ei.drishti.repository.AllEligibleCouples;
import org.ei.drishti.repository.AllRencanaPersalinan;
import org.ei.drishti.service.formSubmission.handler.ReportFieldsDefinition;
import org.ei.drishti.service.scheduling.RencanaPersalinanSchedulesService;
import org.ei.drishti.util.SafeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RencanaPersalinanService {
	private static Logger logger = LoggerFactory.getLogger(ActionService.class.toString());
	 private AllRencanaPersalinan allRencanaPersalinan;
	 private ReportFieldsDefinition reportFieldsDefinition;
	 private RencanaPersalinanSchedulesService schedulingService;

	 public void registerRencanaPersalinan(FormSubmission submission) {
	     
	    }
}
