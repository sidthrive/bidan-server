package org.ei.drishti.repository;

import java.util.List;

import org.ei.drishti.common.AllConstants;
import org.ei.drishti.domain.Child;
import org.ei.drishti.domain.KartuIbu;
import org.ektorp.CouchDbConnector;
import org.motechproject.dao.MotechBaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AllKartuIbu extends MotechBaseRepository<KartuIbu> {
    private static Logger logger = LoggerFactory.getLogger(AllEligibleCouples.class);
	@Autowired
    public AllKartuIbu(@Qualifier(AllConstants.DRISHTI_DATABASE_CONNECTOR) CouchDbConnector db) {
        super(KartuIbu.class, db);
    }
	public KartuIbu findByCaseId(String caseId) {
		 List<KartuIbu> kartu_ibu = queryView("by_caseId", caseId);
	        if (kartu_ibu == null || kartu_ibu.isEmpty()) {
	            return null;
	        }
	        return kartu_ibu.get(0);
	}

}
