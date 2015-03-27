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
	private String UsiaKehamilansaatpersalinan;
	@JsonProperty
	private String UsiakehamilanberdasarkanHPHT;
	@JsonProperty
	private String KeadaanIbu;
	@JsonProperty
	private String KeadaanBayi;
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

	public String getUsiaKehamilansaatpersalinan() {
		return UsiaKehamilansaatpersalinan;
	}
	public void setUsiaKehamilansaatpersalinan(String UsiaKehamilansaatpersalinan) {
		this.UsiaKehamilansaatpersalinan = UsiaKehamilansaatpersalinan;
	}

	public String getUsiakehamilanberdasarkanHPHT() {
		return UsiakehamilanberdasarkanHPHT;
	}

	public void setUsiakehamilanberdasarkanHPHT(String UsiakehamilanberdasarkanHPHT) {
		this.UsiakehamilanberdasarkanHPHT = UsiakehamilanberdasarkanHPHT;
	}

	public String getKeadaanIbu() {
		return KeadaanIbu;
	}

	public void setKeadaanIbu(String KeadaanIbu) {
		this.KeadaanIbu = KeadaanIbu;
	}

	public String getKeadaanBayi() {
		return KeadaanBayi;
	}

	public void setKeadaanBayi(String KeadaanBayi) {
		this.KeadaanBayi = KeadaanBayi;
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

	public DokumentasiPersalinan withUsiaKehamilansaatpersalinan(String UsiaKehamilansaatpersalinan) {
		setUsiaKehamilansaatpersalinan(UsiaKehamilansaatpersalinan);
		return this;
	}

	public DokumentasiPersalinan withUsiakehamilanberdasarkanHPHT(String UsiakehamilanberdasarkanHPHT) {
		setUsiakehamilanberdasarkanHPHT(UsiakehamilanberdasarkanHPHT);
		return this;
	}

	public DokumentasiPersalinan withKeadaanIbu(String KeadaanIbu) {
		setKeadaanIbu(KeadaanIbu);
		return this;
	}

	public DokumentasiPersalinan withKeadaanBayi(String KeadaanBayi) {
		setKeadaanBayi(KeadaanBayi);
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
