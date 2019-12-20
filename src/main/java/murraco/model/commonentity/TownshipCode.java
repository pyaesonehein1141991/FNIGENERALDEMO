package murraco.model.commonentity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import murraco.model.common.CommonCreateAndUpateMarks;

@Entity
@Table(name = "TOWNSHIPCODE")
@NamedQueries(value = { @NamedQuery(name = "TownshipCode.findAll", query = "SELECT ts FROM TownshipCode ts ORDER BY ts.name ASC"),
		@NamedQuery(name = "TownshipCode.findById", query = "SELECT ts FROM TownshipCode ts WHERE ts.id = :id") })
public class TownshipCode implements Serializable {
	private static final long serialVersionUID = 7393371719430453210L;
	@Id
	private String id;
	private String name;
	private String townshipcodeno;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STATECODEID", referencedColumnName = "ID")
	private StateCode stateCode;

	@Embedded
	private CommonCreateAndUpateMarks commonCreateAndUpateMarks;

	@Version
	private int version;

	public TownshipCode() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTownshipcodeno() {
		return townshipcodeno;
	}

	public void setTownshipcodeno(String townshipcodeno) {
		this.townshipcodeno = townshipcodeno;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public StateCode getStateCode() {
		return stateCode;
	}

	public void setStateCode(StateCode stateCode) {
		this.stateCode = stateCode;
	}
	
	  public CommonCreateAndUpateMarks getCommonCreateAndUpateMarks() { return
	  commonCreateAndUpateMarks; }
	  
	  public void setCommonCreateAndUpateMarks(CommonCreateAndUpateMarks
	  commonCreateAndUpateMarks) { this.commonCreateAndUpateMarks =
	  commonCreateAndUpateMarks; }
	 

}