package org.ei.drishti.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.TypeDiscriminator;
import org.motechproject.model.MotechBaseDataObject;

@TypeDiscriminator("doc.type === 'kartu_ibu_partograf'")
public class KartuIbuPartograf extends MotechBaseDataObject {
	@JsonProperty
	private String motherId;
	@JsonProperty
	private String id;
	@JsonProperty
	private String NoRegister;
	@JsonProperty
	private String NoPuskesmas;
	@JsonProperty
	private String NamaIbu;
	@JsonProperty
	private String Umur;
	@JsonProperty
	private String KetubanPecah;
	@JsonProperty
	private String DenyutjantungJanin;
	@JsonProperty
	private String AirKetuban;
	@JsonProperty
	private String Penyusupankepala;
	
	

	private KartuIbuPartograf()
	{
		
	}

	public KartuIbuPartograf(String motherId) {
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

	public String getNoRegister() {
		return NoRegister;
	}
	public void setNoRegister(String NoRegister) {
		this.NoRegister = NoRegister;
	}

	public String getNoPuskesmas() {
		return NoPuskesmas;
	}

	public void setNoPuskesmas(String NoPuskesmas) {
		this.NoPuskesmas = NoPuskesmas;
	}

	public String getNamaIbu() {
		return NamaIbu;
	}

	public void setNamaIbu(String NamaIbu) {
		this.NamaIbu = NamaIbu;
	}

	public String getUmur() {
		return Umur;
	}

	public void setUmur(String Umur) {
		this.Umur = Umur;
	}

	public void setKetubanPecah(String KetubanPecah) {
		this.KetubanPecah = KetubanPecah;
	}

	public String getDenyutjantungJanin() {
		return DenyutjantungJanin;
	}

	public void setDenyutjantungJanin(String DenyutjantungJanin) {
		this.DenyutjantungJanin = DenyutjantungJanin;
	}

	public String getAirKetuban() {
		return AirKetuban;
	}

	public void setAirKetuban(String AirKetuban) {
		this.AirKetuban = AirKetuban;
	}

	public String getPenyusupankepala() {
		return Penyusupankepala;
	}

	public void setPenyusupankepala(String Penyusupankepala) {
		this.Penyusupankepala = Penyusupankepala;
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

	public KartuIbuPartograf withmotherId(String motherId) {
		setmotherId(motherId);
		return this;
	}

	public KartuIbuPartograf withNoRegister(String NoRegister) {
		setNoRegister(NoRegister);
		return this;
	}

	public KartuIbuPartograf withNoPuskesmas(String NoPuskesmas) {
		setNoPuskesmas(NoPuskesmas);
		return this;
	}

	public KartuIbuPartograf withNamaIbu(String NamaIbu) {
		setNamaIbu(NamaIbu);
		return this;
	}

	public KartuIbuPartograf withUmur(String Umur) {
		setUmur(Umur);
		return this;
	}

	
	public KartuIbuPartograf withid(String id) {
		setId(id);
		return this;
	}

	public KartuIbuPartograf withKetubanPecah(String KetubanPecah) {
		setKetubanPecah(KetubanPecah);
        return this;
    }
}
