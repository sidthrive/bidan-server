package org.ei.drishti.repository;

import java.util.List;

import org.ei.drishti.common.AllConstants;
import org.ei.drishti.domain.Child;
import org.ei.drishti.domain.DokumentasiPersalinan;
import org.ektorp.CouchDbConnector;
import org.motechproject.dao.MotechBaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AllDokumentasiPersalinan extends MotechBaseRepository<DokumentasiPersalinan> {
    private static Logger logger = LoggerFactory.getLogger(AllEligibleCouples.class);
	@Autowired
    public AllDokumentasiPersalinan(@Qualifier(AllConstants.DRISHTI_DATABASE_CONNECTOR) CouchDbConnector db) {
        super(DokumentasiPersalinan.class, db);
    }
	public DokumentasiPersalinan findByCaseId(String motherId) {
		 List<DokumentasiPersalinan> dokumentasi_persalinan = queryView("by_caseId", motherId);
	        if (dokumentasi_persalinan == null || dokumentasi_persalinan.isEmpty()) {
	            return null;
	        }
	        return dokumentasi_persalinan.get(0);
	}

}
