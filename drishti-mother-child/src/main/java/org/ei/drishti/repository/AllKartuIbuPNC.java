package org.ei.drishti.repository;

import java.util.List;

import org.ei.drishti.common.AllConstants;
import org.ei.drishti.domain.Child;
import org.ei.drishti.domain.KartuIbuPNC;
import org.ektorp.CouchDbConnector;
import org.motechproject.dao.MotechBaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AllKartuIbuPNC extends MotechBaseRepository<KartuIbuPNC> {
    private static Logger logger = LoggerFactory.getLogger(AllEligibleCouples.class);
	@Autowired
    public AllKartuIbuPNC(@Qualifier(AllConstants.DRISHTI_DATABASE_CONNECTOR) CouchDbConnector db) {
        super(KartuIbuPNC.class, db);
    }
	public KartuIbuPNC findByCaseId(String motherId) {
		 List<KartuIbuPNC> KartuIbuPNC = queryView("by_caseId", motherId);
	        if (KartuIbuPNC == null || KartuIbuPNC.isEmpty()) {
	            return null;
	        }
	        return KartuIbuPNC.get(0);
	}

}
