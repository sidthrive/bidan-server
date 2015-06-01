package org.ei.drishti.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.TypeDiscriminator;
import org.motechproject.model.MotechBaseDataObject;

@TypeDiscriminator("doc.type === 'kohort_bayi'")
public class KohortBayi extends MotechBaseDataObject {
	@JsonProperty
	private String motherId;
	@JsonProperty
	private String id;
	@JsonProperty
	private String childId;
	@JsonProperty
	private String NoIndex;
	@JsonProperty
	private String NamaBayi;
	@JsonProperty
	private String TanggalLahir;
	@JsonProperty
	private String JenisKelamin;
	@JsonProperty
	private String Namaorangtua;
	@JsonProperty
	private String BeratLahir;
	@JsonProperty
	private String KepemilikanbukuKIA;
	
	

	private KohortBayi()
	{
		
	}

	public KohortBayi(String motherId) {
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

	public String getchildId() {
		return childId;
	}

	public void setchildId(String childId) {
		this.childId = childId;
	}

	public String getNoIndex() {
		return NoIndex;
	}

	public void setNoIndex(String noIndex) {
		NoIndex = noIndex;
	}

	public String getNamaBayi() {
		return NamaBayi;
	}

	public void setNamaBayi(String namaBayi) {
		NamaBayi = namaBayi;
	}

	public String getTanggalLahir() {
		return TanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		TanggalLahir = tanggalLahir;
	}

	public String getJenisKelamin() {
		return JenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		JenisKelamin = jenisKelamin;
	}

	public String getNamaorangtua() {
		return Namaorangtua;
	}

	public void setNamaorangtua(String namaorangtua) {
		Namaorangtua = namaorangtua;
	}

	public String getBeratLahir() {
		return BeratLahir;
	}

	public void setBeratLahir(String beratLahir) {
		BeratLahir = beratLahir;
	}

	public String getKepemilikanbukuKIA() {
		return KepemilikanbukuKIA;
	}

	public void setKepemilikanbukuKIA(String kepemilikanbukuKIA) {
		KepemilikanbukuKIA = kepemilikanbukuKIA;
	}

	public void setId(String id) {
		this.id = id;
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

	public KohortBayi withmotherId(String motherId) {
		setmotherId(motherId);
		return this;
	}

	public KohortBayi withchildId(String childId) {
		setchildId(childId);
		return this;
	}

	public KohortBayi withNoIndex(String NoIndex) {
		setNoIndex(NoIndex);
		return this;
	}

	public KohortBayi withNamaBayi(String NamaBayi) {
		setNamaBayi(NamaBayi);
		return this;
	}

	public KohortBayi withTanggalLahir(String TanggalLahir) {
		setTanggalLahir(TanggalLahir);
		return this;
	}

	
	public KohortBayi withid(String id) {
		setId(id);
		return this;
	}

	public KohortBayi withJenisKelamin(String JenisKelamin) {
		setJenisKelamin(JenisKelamin);
        return this;
    }
}
