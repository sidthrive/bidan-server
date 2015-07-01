package org.ei.drishti.reporting.repository;

import org.ei.drishti.reporting.domain.UniqueId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anis on 7/1/2015.
 */

@Repository
public class AllUniqueIdRepository {
    private DataAccessTemplate dataAccessTemplate;

    protected AllUniqueIdRepository(){

    }

    @Autowired
    public AllUniqueIdRepository(@Qualifier("serviceProvidedDataAccessTemplate") DataAccessTemplate dataAccessTemplate){
        this.dataAccessTemplate = dataAccessTemplate;
    }

    public List fetchUniqueIds(String anmIdentifier){
        return dataAccessTemplate.findByNamedQueryAndNamedParam(UniqueId.FIND_BY_ANM_IDENTIFIER,
                new String[]{"anmIdentifier"}, new Object[]{anmIdentifier});
    }
}
