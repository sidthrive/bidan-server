package org.ei.drishti.dto;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Anis on 7/1/2015.
 */
public class UniqueIdDTO {
    @JsonProperty
    private Long firstId;
    @JsonProperty
    private Long lastId;

    public UniqueIdDTO(){
        this.firstId = -1L;
        this.lastId = -1L;
    }

    public UniqueIdDTO(Long firstId, Long lastId) {
        this.firstId = firstId;
        this.lastId = lastId;
    }

    public Long getFirstId() {
        return firstId;
    }

    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }

    public Long getLastId() {
        return lastId;
    }

    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }
}
