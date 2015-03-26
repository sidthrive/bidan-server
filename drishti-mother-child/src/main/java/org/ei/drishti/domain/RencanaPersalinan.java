package org.ei.drishti.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.TypeDiscriminator;
import org.motechproject.model.MotechBaseDataObject;

@TypeDiscriminator("doc.type === 'rencana_persalinan'")
public class RencanaPersalinan extends MotechBaseDataObject {
	@JsonProperty
	private String motherId;
	@JsonProperty
	private String id;
	@JsonProperty
	private String RencanaPenolongPersalinan;
	@JsonProperty
	private String TempatRencanaPersalinan;
	@JsonProperty
	private String RencanaPendampingPersalinan;
	@JsonProperty
	private String Transportasi;
	@JsonProperty
	private String Pendonor;
	@JsonProperty
	private String Tanggalkujungan;
	@JsonProperty
	private String Jamkesmas;
	@JsonProperty
	private String UsiaKlinis;
	
	

	private RencanaPersalinan()
	{
		
	}

	public RencanaPersalinan(String motherId) {
		this.motherId = motherId;
	}

	public String getmotherId() {
		return motherId;
	}

	public void setmotherId(String motherId) {
		this.motherId = motherId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRencanaPenolongPersalinan() {
		return RencanaPenolongPersalinan;
	}
	public void setRencanaPenolongPersalinan(String RencanaPenolongPersalinan) {
		this.RencanaPenolongPersalinan = RencanaPenolongPersalinan;
	}

	public String getPJamkesmas() {
		return Jamkesmas;
	}

	public void setJamkesmas(String Jamkesmas) {
		this.Jamkesmas = Jamkesmas;
	}

	public String getTempatRencanaPersalinan() {
		return TempatRencanaPersalinan;
	}

	public void setTempatRencanaPersalinan(String TempatRencanaPersalinan) {
		this.TempatRencanaPersalinan = TempatRencanaPersalinan;
	}

	public String getUsiaKlinis() {
		return UsiaKlinis;
	}

	public void setUsiaKlinis(String UsiaKlinis) {
		this.UsiaKlinis = UsiaKlinis;
	}

	public void setRencanaPendampingPersalinan(String RencanaPendampingPersalinan) {
		this.RencanaPendampingPersalinan = RencanaPendampingPersalinan;
	}

	public String getTransportasi() {
		return Transportasi;
	}

	public void setTransportasi(String Transportasi) {
		this.Transportasi = Transportasi;
	}

	public String getPendonor() {
		return Pendonor;
	}

	public void setPendonor(String Pendonor) {
		this.Pendonor = Pendonor;
	}

	public String getTanggalkujungan() {
		return Tanggalkujungan;
	}

	public void setTanggalkujungan(String Tanggalkujungan) {
		this.Tanggalkujungan = Tanggalkujungan;
	}

	

	

	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o, "id", "revision");
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "revision");
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public RencanaPersalinan withmotherId(String motherId) {
		setmotherId(motherId);
		return this;
	}

	public RencanaPersalinan withRencanaPenolongPersalinan(String RencanaPenolongPersalinan) {
		setRencanaPenolongPersalinan(RencanaPenolongPersalinan);
		return this;
	}

	public RencanaPersalinan withTempatRencanaPersalinan(String TempatRencanaPersalinan) {
		setTempatRencanaPersalinan(TempatRencanaPersalinan);
		return this;
	}

	public RencanaPersalinan withRencanaPendampingPersalinan(String RencanaPendampingPersalinan) {
		setRencanaPendampingPersalinan(RencanaPendampingPersalinan);
		return this;
	}

	public RencanaPersalinan withTransportasi(String Transportasi) {
		setTransportasi(Transportasi);
		return this;
	}

	
	public RencanaPersalinan withid(String id) {
		setId(id);
		return this;
	}

	public RencanaPersalinan withPendonor(String Pendonor) {
		setPendonor(Pendonor);
        return this;
    }
}
