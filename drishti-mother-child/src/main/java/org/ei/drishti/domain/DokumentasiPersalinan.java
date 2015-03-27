package org.ei.drishti.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.TypeDiscriminator;
import org.motechproject.model.MotechBaseDataObject;

@TypeDiscriminator("doc.type === 'dokumentasi_persalinan'")
public class DokumentasiPersalinan extends MotechBaseDataObject {
	@JsonProperty
	private String motherId;
	@JsonProperty
	private String id;
	@JsonProperty
	private String CaraPersalinanIbu;
	@JsonProperty
	private String TanggalKalaIAktif;
	@JsonProperty
	private String TanggalKalaII;
	@JsonProperty
	private String TanggalPlasentaLahir;
	@JsonProperty
	private String Persentasi;
	@JsonProperty
	private String Tempat;
	@JsonProperty
	private String Penolong;
	@JsonProperty
	private String Komplikasi;
	
	

	private DokumentasiPersalinan()
	{
		
	}

	public DokumentasiPersalinan(String motherId) {
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

	public String getCaraPersalinanIbu() {
		return CaraPersalinanIbu;
	}
	public void setCaraPersalinanIbu(String CaraPersalinanIbu) {
		this.CaraPersalinanIbu = CaraPersalinanIbu;
	}

	public String getTanggalKalaIAktif() {
		return TanggalKalaIAktif;
	}

	public void setTanggalKalaIAktif(String TanggalKalaIAktif) {
		this.TanggalKalaIAktif = TanggalKalaIAktif;
	}

	public String getTanggalKalaII() {
		return TanggalKalaII;
	}

	public void setTanggalKalaII(String TanggalKalaII) {
		this.TanggalKalaII = TanggalKalaII;
	}

	public String getTanggalPlasentaLahir() {
		return TanggalPlasentaLahir;
	}

	public void setTanggalPlasentaLahir(String TanggalPlasentaLahir) {
		this.TanggalPlasentaLahir = TanggalPlasentaLahir;
	}

	public void setPersentasi(String Persentasi) {
		this.Persentasi = Persentasi;
	}

	public String getTempat() {
		return Tempat;
	}

	public void setTempat(String Tempat) {
		this.Tempat = Tempat;
	}

	public String getPenolong() {
		return Penolong;
	}

	public void setPenolong(String Penolong) {
		this.Penolong = Penolong;
	}

	public String getKomplikasi() {
		return Komplikasi;
	}

	public void setKomplikasi(String Komplikasi) {
		this.Komplikasi = Komplikasi;
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

	public DokumentasiPersalinan withmotherId(String motherId) {
		setmotherId(motherId);
		return this;
	}

	public DokumentasiPersalinan withCaraPersalinanIbu(String CaraPersalinanIbu) {
		setCaraPersalinanIbu(CaraPersalinanIbu);
		return this;
	}

	public DokumentasiPersalinan withTanggalKalaIAktif(String TanggalKalaIAktif) {
		setTanggalKalaIAktif(TanggalKalaIAktif);
		return this;
	}

	public DokumentasiPersalinan withTanggalKalaII(String TanggalKalaII) {
		setTanggalKalaII(TanggalKalaII);
		return this;
	}

	public DokumentasiPersalinan withTanggalPlasentaLahir(String TanggalPlasentaLahir) {
		setTanggalPlasentaLahir(TanggalPlasentaLahir);
		return this;
	}

	
	public DokumentasiPersalinan withid(String id) {
		setId(id);
		return this;
	}

	public DokumentasiPersalinan withPersentasi(String Persentasi) {
		setPersentasi(Persentasi);
        return this;
    }
}
