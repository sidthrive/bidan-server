package org.ei.drishti.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.TypeDiscriminator;
import org.motechproject.model.MotechBaseDataObject;

@TypeDiscriminator("doc.type === 'kartu_ibu_PNC'")
public class KartuIbuPNC extends MotechBaseDataObject {
	@JsonProperty
	private String motherId;
	@JsonProperty
	private String id;
	@JsonProperty
	private String HariKeKF;
	@JsonProperty
	private String TandaVitalTDSistolik;
	@JsonProperty
	private String TandaVitalTDDiastolik;
	@JsonProperty
	private String TandaVitalSuhu;
	@JsonProperty
	private String TrimesterKe;
	@JsonProperty
	private String PelayananCatatdiBukuKia;
	@JsonProperty
	private String PelayananFe;
	@JsonProperty
	private String PelayananVitA;
	@JsonProperty
	private String Komplikasi;
	@JsonProperty
	private String DirujukKe;
	@JsonProperty
	private String Metodekontrasepsi;
	

	private KartuIbuPNC()
	{
		
	}

	public KartuIbuPNC(String motherId) {
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

	public String getHariKeKF() {
		return HariKeKF;
	}
	public void setHariKeKF(String HariKeKF) {
		this.HariKeKF = HariKeKF;
	}

	public String getTandaVitalTDSistolik() {
		return TandaVitalTDSistolik;
	}

	public void setTandaVitalTDSistolik(String TandaVitalTDSistolik) {
		this.TandaVitalTDSistolik = TandaVitalTDSistolik;
	}

	public String getTandaVitalTDDiastolik() {
		return TandaVitalTDDiastolik;
	}

	public void setTandaVitalTDDiastolik(String TandaVitalTDDiastolik) {
		this.TandaVitalTDDiastolik = TandaVitalTDDiastolik;
	}

	public String getTandaVitalSuhu() {
		return TandaVitalSuhu;
	}

	public void setTandaVitalSuhu(String TandaVitalSuhu) {
		this.TandaVitalSuhu = TandaVitalSuhu;
	}
	public String getTrimesterKe() {
		return TrimesterKe;
	}

	public void setTrimesterKe(String TrimesterKe) {
		this.TrimesterKe = TrimesterKe;
	}

	public String getPelayananCatatdiBukuKia() {
		return PelayananCatatdiBukuKia;
	}

	public void setPelayananCatatdiBukuKia(String PelayananCatatdiBukuKia) {
		this.PelayananCatatdiBukuKia = PelayananCatatdiBukuKia;
	}

	public String getPelayananFe() {
		return PelayananFe;
	}

	public void setPelayananFe(String PelayananFe) {
		this.PelayananFe = PelayananFe;
	}

	public String getPelayananVitA() {
		return PelayananVitA;
	}

	public void setPelayananVitA(String PelayananVitA) {
		this.PelayananVitA = PelayananVitA;
	}

	public String getKomplikasi() {
		return Komplikasi;
	}

	public void setKomplikasi(String Komplikasi) {
		this.Komplikasi = Komplikasi;
	}

	public String getDirujukKe() {
		return DirujukKe;
	}

	public void setDirujukKe(String DirujukKe) {
		this.DirujukKe = DirujukKe;
	}

	public String getMetodekontrasepsi() {
		return Metodekontrasepsi;
	}

	public void setMetodekontrasepsi(String Metodekontrasepsi) {
		this.Metodekontrasepsi = Metodekontrasepsi;
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

	public KartuIbuPNC withmotherId(String motherId) {
		setmotherId(motherId);
		return this;
	}

	public KartuIbuPNC withHariKeKF(String HariKeKF) {
		setHariKeKF(HariKeKF);
		return this;
	}

	public KartuIbuPNC withTandaVitalTDSistolik(String TandaVitalTDSistolik) {
		setTandaVitalTDSistolik(TandaVitalTDSistolik);
		return this;
	}

	public KartuIbuPNC withTandaVitalTDDiastolik(String TandaVitalTDDiastolik) {
		setTandaVitalTDDiastolik(TandaVitalTDDiastolik);
		return this;
	}

	public KartuIbuPNC withDirujukKe(String DirujukKe) {
		setDirujukKe(DirujukKe);
		return this;
	}

	
	public KartuIbuPNC withid(String id) {
		setId(id);
		return this;
	}

	public KartuIbuPNC withMetodekontrasepsi(String Metodekontrasepsi) {
		setMetodekontrasepsi(Metodekontrasepsi);
        return this;
    }
}
