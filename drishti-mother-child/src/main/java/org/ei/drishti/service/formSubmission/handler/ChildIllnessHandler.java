package org.ei.drishti.service.formSubmission.handler;

import org.ei.drishti.form.domain.FormSubmission;
import org.ei.drishti.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChildIllnessHandler implements FormSubmissionHandler {
    private ChildService childService;

    @Autowired
    public ChildIllnessHandler(ChildService childService) {
        this.childService = childService;
    }

    @Override
    public void handle(FormSubmission submission) {
        childService.sickVisitHappened(submission);
    }
}
