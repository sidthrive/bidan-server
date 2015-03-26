package org.ei.drishti.repository;

import java.util.List;

import org.ei.drishti.common.AllConstants;
import org.ei.drishti.domain.Child;
import org.ei.drishti.domain.RencanaPersalinan;
import org.ektorp.CouchDbConnector;
import org.motechproject.dao.MotechBaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AllRencanaPersalinan extends MotechBaseRepository<RencanaPersalinan> {
    private static Logger logger = LoggerFactory.getLogger(AllEligibleCouples.class);
	@Autowired
    public AllRencanaPersalinan(@Qualifier(AllConstants.DRISHTI_DATABASE_CONNECTOR) CouchDbConnector db) {
        super(RencanaPersalinan.class, db);
    }
	public RencanaPersalinan findByCaseId(String motherId) {
		 List<RencanaPersalinan> rencana_persalinan = queryView("by_caseId", motherId);
	        if (rencana_persalinan == null || rencana_persalinan.isEmpty()) {
	            return null;
	        }
	        return rencana_persalinan.get(0);
	}

}
