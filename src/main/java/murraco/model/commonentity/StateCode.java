package murraco.model.commonentity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

import murraco.model.common.CommonCreateAndUpateMarks;

@Entity
@Table(name = "STATECODE")
@NamedQueries(value = { @NamedQuery(name = "StateCode.findAll", query = "SELECT s FROM StateCode s ORDER BY s.codeNo ASC"),
		@NamedQuery(name = "StateCode.findById", query = "SELECT s FROM StateCode s WHERE s.id = :id") })
public class StateCode implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String codeNo;

	@Version
	private int version;

	
	@Embedded
	 private CommonCreateAndUpateMarks commonCreateAndUpateMarks;
	 
	public StateCode() {

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

	public String getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public CommonCreateAndUpateMarks getCommonCreateAndUpateMarks() {
		return commonCreateAndUpateMarks;
	}

	public void setCommonCreateAndUpateMarks(CommonCreateAndUpateMarks commonCreateAndUpateMarks) {
		this.commonCreateAndUpateMarks = commonCreateAndUpateMarks;
	}
	
	

	
}