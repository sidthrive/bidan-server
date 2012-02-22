package org.ei.drishti.controller;

import org.ei.commcare.listener.CommCareFormSubmissionDispatcher;
import org.ei.drishti.contract.AnteNatalCareCloseInformation;
import org.ei.drishti.contract.AnteNatalCareEnrollmentInformation;
import org.ei.drishti.contract.AnteNatalCareInformation;
import org.ei.drishti.contract.AnteNatalCareOutcomeInformation;
import org.ei.drishti.service.ANCService;
import org.ei.drishti.service.TrackingService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class DrishtiControllerTest {
    @Mock
    private CommCareFormSubmissionDispatcher dispatcher;
    @Mock
    private ANCService ancService;
    @Mock
    private TrackingService trackingService;

    private DrishtiController controller;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        controller = new DrishtiController(dispatcher, ancService, trackingService);
    }

    @Test
    public void shouldDelegateToBothANCServiceAndMCTSDuringMotherRegistration() {
        AnteNatalCareEnrollmentInformation ancEnrollInfo = mock(AnteNatalCareEnrollmentInformation.class);

        controller.registerMother(ancEnrollInfo);

        verify(ancService).registerANCCase(ancEnrollInfo);
        verify(trackingService).registerANCCase(ancEnrollInfo);
    }

    @Test
    public void shouldDelegateToBothANCServiceAndMCTSDuringANCCareProvision() throws Exception {
        AnteNatalCareInformation ancInformation = mock(AnteNatalCareInformation.class);

        controller.updateANCCareInformation(ancInformation);

        verify(ancService).ancCareHasBeenProvided(ancInformation);
        verify(trackingService).ancCareHasBeenProvided(ancInformation);
    }

    @Test
    public void shouldDelegateToBothANCServiceAndMCTSDuringANCCareOutcome() throws Exception {
        AnteNatalCareOutcomeInformation careOutcomeInformation = mock(AnteNatalCareOutcomeInformation.class);

        controller.updateOutcomeOfANC(careOutcomeInformation);

        verify(ancService).updateANCOutcome(careOutcomeInformation);
        verify(trackingService).updateANCOutcome(careOutcomeInformation);
    }

    @Test
    public void shouldDelegateToBothANCServiceAndMCTSDuringANCClose() throws Exception {
        AnteNatalCareCloseInformation closeInformation = mock(AnteNatalCareCloseInformation.class);

        controller.closeANCCase(closeInformation);

        verify(ancService).closeANCCase(closeInformation);
        verify(trackingService).closeANCCase(closeInformation);
    }
}