package org.ei.drishti.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.TypeDiscriminator;
import org.motechproject.model.MotechBaseDataObject;

@TypeDiscriminator("doc.type === 'kartu_ibu_old'")
public class KartuIbu extends MotechBaseDataObject {
	@JsonProperty
	private String caseId;
	@JsonProperty
	private String id;
	@JsonProperty
	private String district;
	@JsonProperty
	private String Province;
	@JsonProperty
	private String Kabupaten;
	@JsonProperty
	private String puskesmas;
	@JsonProperty
	private String subCenter;
	@JsonProperty
	private String village;
	@JsonProperty
	private String ecNumber;
	@JsonProperty
	private String wifeName;
	@JsonProperty
	private String wifeAge;
	@JsonProperty
	private String womanDOB;
	@JsonProperty
	private String phoneNumber;
	
	@JsonProperty
	private String anmIdentifier;
	
	public String getAnmIdentifier() {
		return anmIdentifier;
	}

	public void setAnmIdentifier(String anmIdentifier) {
		this.anmIdentifier = anmIdentifier;
	}

	private KartuIbu()
	{
		
	}

	public KartuIbu(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String Province) {
		this.Province = Province;
	}

	public String getKabupaten() {
		return Kabupaten;
	}

	public void setKabupaten(String Kabupaten) {
		this.Kabupaten = Kabupaten;
	}

	public String getpuskesmas() {
		return puskesmas;
	}

	public void setpuskesmas(String puskesmas) {
		this.puskesmas = puskesmas;
	}

	public void setecNumber(String ecNumber) {
		this.ecNumber = ecNumber;
	}

	public String getwifeName() {
		return wifeName;
	}

	public void setwifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public String getwomanDOB() {
		return womanDOB;
	}

	public void setwomanDOB(String womanDOB) {
		this.womanDOB = womanDOB;
	}

	public String getwifeAge() {
		return wifeAge;
	}

	public void setwifeAge(String wifeAge) {
		this.wifeAge = wifeAge;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getsubCenter() {
		return subCenter;
	}

	public void setsubCenter(String subCenter) {
		this.subCenter = subCenter;
	}

	public String getvillage() {
		return village;
	}

	public void setvillage(String village) {
		this.village = village;
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

	public KartuIbu withName(String wifeName) {
		setwifeName(wifeName);
		return this;
	}

	public KartuIbu withDob(String womanDOB) {
		setwomanDOB(womanDOB);
		return this;
	}

	public KartuIbu withphoneNumber(String phoneNumber) {
		setphoneNumber(phoneNumber);
		return this;
	}

	public KartuIbu withsubCenter(String subCenter) {
		setsubCenter(subCenter);
		return this;
	}

	public KartuIbu withvillage(String village) {
		setvillage(village);
		return this;
	}

	
	public KartuIbu withid(String id) {
		setId(id);
		return this;
	}

	public KartuIbu withLocation(String Province, String Kabupaten, String puskesmas) {
        this.Province = Province;
        this.Kabupaten = Kabupaten;
        this.puskesmas = puskesmas;
        return this;
    }
	
	public KartuIbu withANMIdentifier(String anmIdentifier) {
        this.anmIdentifier = anmIdentifier;
        return this;
    }
}
