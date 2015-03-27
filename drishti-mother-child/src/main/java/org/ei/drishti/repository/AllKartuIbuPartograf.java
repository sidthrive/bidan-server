package org.ei.drishti.repository;

import java.util.List;

import org.ei.drishti.common.AllConstants;
import org.ei.drishti.domain.Child;
import org.ei.drishti.domain.KartuIbuPartograf;
import org.ektorp.CouchDbConnector;
import org.motechproject.dao.MotechBaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AllKartuIbuPartograf extends MotechBaseRepository<KartuIbuPartograf> {
    private static Logger logger = LoggerFactory.getLogger(AllEligibleCouples.class);
	@Autowired
    public AllKartuIbuPartograf(@Qualifier(AllConstants.DRISHTI_DATABASE_CONNECTOR) CouchDbConnector db) {
        super(KartuIbuPartograf.class, db);
    }
	public KartuIbuPartograf findByCaseId(String motherId) {
		 List<KartuIbuPartograf> kartu_ibu_partograf = queryView("by_caseId", motherId);
	        if (kartu_ibu_partograf == null || kartu_ibu_partograf.isEmpty()) {
	            return null;
	        }
	        return kartu_ibu_partograf.get(0);
	}

}
