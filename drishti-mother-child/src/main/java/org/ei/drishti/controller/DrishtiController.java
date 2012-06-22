package org.ei.drishti.controller;

import org.ei.commcare.listener.CommCareFormSubmissionRouter;
import org.ei.drishti.contract.*;
import org.ei.drishti.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DrishtiController {
    private static Logger logger = LoggerFactory.getLogger(DrishtiController.class.toString());

    private final ANCService ancService;
    private final PNCService pncService;
    private DrishtiMCTSService mctsService;
    private ECService ecService;

    @Autowired
    public DrishtiController(CommCareFormSubmissionRouter router, ANCService ancService, PNCService pncService, ECService ecService, DrishtiMCTSService drishtiMctsService) {
        router.registerForDispatch(this);
        this.ancService = ancService;
        this.pncService = pncService;
        this.ecService = ecService;
        this.mctsService = drishtiMctsService;
    }

    public void registerMother(AnteNatalCareEnrollmentInformation enrollmentInformation) {
        logger.info("Mother registration: " + enrollmentInformation);

        ancService.registerANCCase(enrollmentInformation);
        mctsService.registerANCCase(enrollmentInformation);
    }

    public void updateANCCareInformation(AnteNatalCareInformation ancInformation) {
        logger.info("ANC care: " + ancInformation);

        ancService.ancCareHasBeenProvided(ancInformation);
        mctsService.ancCareHasBeenProvided(ancInformation);
    }

    public void updateOutcomeOfANC(AnteNatalCareOutcomeInformation outcomeInformation) {
        logger.info("ANC outcome: " + outcomeInformation);

        ancService.updateANCOutcome(outcomeInformation);
        mctsService.updateANCOutcome(outcomeInformation);
    }

    public void closeANCCase(AnteNatalCareCloseInformation closeInformation) {
        logger.info("ANC close: " + closeInformation);

        ancService.closeANCCase(closeInformation);
        mctsService.closeANCCase(closeInformation);
    }

    public void registerChild(ChildRegistrationRequest childInformation) {
        logger.info("New child registration: " + childInformation);

        pncService.registerChild(childInformation);
        mctsService.registerChild(childInformation);
    }

    public void updateChildImmunization(ChildImmunizationUpdationRequest updationRequest, Map<String, String> extraData) {
        logger.info("Child immunization updation: " + updationRequest);

        pncService.updateChildImmunization(updationRequest, extraData);
        mctsService.updateChildImmunization(updationRequest);
    }

    public void closeChildCase(ChildCloseRequest childCloseRequest) {
        logger.info("Child close: " + childCloseRequest);

        pncService.closeChildCase(childCloseRequest);
        mctsService.closeChildCase(childCloseRequest);
    }

    public void registerEligibleCouple(EligibleCoupleRegistrationRequest eligibleCoupleRegistrationRequest, Map<String, String> extraData) {
        logger.info("Eligible couple registration: " + eligibleCoupleRegistrationRequest + ". Extra data: " + extraData);

        ecService.registerEligibleCouple(eligibleCoupleRegistrationRequest);
    }

    public void closeEligibleCouple(EligibleCoupleCloseRequest eligibleCoupleCloseRequest) {
        logger.info("Eligible couple close: " + eligibleCoupleCloseRequest);

        ecService.closeEligibleCouple(eligibleCoupleCloseRequest);
    }
}