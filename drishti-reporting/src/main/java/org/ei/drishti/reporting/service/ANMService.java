package org.ei.drishti.reporting.service;

import org.ei.drishti.reporting.domain.ANM;
import org.ei.drishti.reporting.domain.Location;
import org.ei.drishti.reporting.domain.SP_ANM;
import org.ei.drishti.reporting.repository.AllLocationsRepository;
import org.ei.drishti.reporting.repository.AllSP_ANMsRepository;
import org.ei.drishti.reporting.repository.AllUniqueIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ANMService {
    private AllSP_ANMsRepository allANMsRepository;
    private AllLocationsRepository allLocationsRepository;
    private AllUniqueIdRepository allUniqueIdRepository;

    protected ANMService() {
    }

    @Autowired
    public ANMService(AllSP_ANMsRepository allANMsRepository, AllLocationsRepository allLocationsRepository) {
        this.allANMsRepository = allANMsRepository;
        this.allLocationsRepository = allLocationsRepository;
    }

    @Transactional("service_provided")
    public List<SP_ANM> all() {
        return allANMsRepository.fetchAll();
    }

    @Transactional("service_provided")
    public Location getLocation(String anmIdentifier) {
        return allLocationsRepository.fetchByANMIdentifier(anmIdentifier);
    }

    @Transactional("service_provided")
    public List getVillagesForANM(String anmIdentifier) {
        return allLocationsRepository.fetchVillagesForANM(anmIdentifier);
    }

    @Transactional("service_provided")
    public List<SP_ANM> anmsInTheSameSC(String anmIdentifier) {
        return allANMsRepository.fetchAllANMSInSameSC(anmIdentifier);
    }

    @Transactional("service_provided")
    public List<SP_ANM> anmsInTheSamePHC(String anmIdentifier) {
        return allANMsRepository.fetchAllANMSInSamePHC(anmIdentifier);
    }

    @Transactional("service_provided")
    public List<ANM> getUniqueIdsforAnm(String anmIdentifier){
        return allUniqueIdRepository.fetchUniqueIds(anmIdentifier);
    }


}
