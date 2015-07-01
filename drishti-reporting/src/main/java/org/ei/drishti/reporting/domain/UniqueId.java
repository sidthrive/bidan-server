package org.ei.drishti.reporting.domain;

import javax.persistence.*;

/**
 * Created by Anis on 7/1/2015.
 */
@Entity
@Table(name="unique_id")
@NamedQueries({
        @NamedQuery(name = UniqueId.FIND_BY_ANM_IDENTIFIER,
        query = "select r from UniqueId r, ANM a where a.anmIdentifier = :anmIdentifier and r.anm_id = a.id")
})
public class UniqueId {
    public static final String FIND_BY_ANM_IDENTIFIER = "find.by.anm.identifier";
    public static final int INCREMENT = 10000;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "anm_id", insertable = true, updatable = true)
    @ManyToOne
    private ANM anm;

    @Column(name = "lastValue")
    private Long lastValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ANM getAnm() {
        return anm;
    }

    public void setAnm(ANM anm) {
        this.anm = anm;
    }

    public Long getLastValue() {
        return lastValue;
    }

    public void setLastValue(Long lastValue) {
        this.lastValue = lastValue;
    }
}
