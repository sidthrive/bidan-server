package org.ei.drishti.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anis on 7/1/2015.
 */
public class UniqueIdDTO {


    private List<Long> Ids;

    public UniqueIdDTO(){
        this.Ids = new ArrayList<Long>();
    }

    public UniqueIdDTO(List<Long> ids) {
        this.Ids = ids;
    }

    public List<Long> getIds() {
        return Ids;
    }

    public void setIds(List<Long> ids) {
        Ids = ids;
    }
}
