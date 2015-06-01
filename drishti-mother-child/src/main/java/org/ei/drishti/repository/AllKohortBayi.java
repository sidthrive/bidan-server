package org.ei.drishti.repository;

import java.util.List;

import org.ei.drishti.common.AllConstants;
import org.ei.drishti.domain.Child;
import org.ei.drishti.domain.KohortBayi;
import org.ektorp.CouchDbConnector;
import org.motechproject.dao.MotechBaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AllKohortBayi extends MotechBaseRepository<KohortBayi> {
    private static Logger logger = LoggerFactory.getLogger(AllEligibleCouples.class);
	@Autowired
    public AllKohortBayi(@Qualifier(AllConstants.DRISHTI_DATABASE_CONNECTOR) CouchDbConnector db) {
        super(KohortBayi.class, db);
    }
	public KohortBayi findByCaseId(String motherId) {
		 List<KohortBayi> kohort_bayi = queryView("by_caseId", motherId);
	        if (kohort_bayi == null || kohort_bayi.isEmpty()) {
	            return null;
	        }
	        return kohort_bayi.get(0);
	}

}
