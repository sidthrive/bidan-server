package org.ei.drishti.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anis on 7/1/2015.
 */
public class UniqueIdDTO {


    private List<Long> ids;

    public UniqueIdDTO(){
        this.ids = new ArrayList<Long>();
    }

    public UniqueIdDTO(List<Long> ids) {
        this.ids = ids;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
