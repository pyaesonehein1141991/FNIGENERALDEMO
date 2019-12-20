package murraco.model.commonentity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

import murraco.model.common.CommonCreateAndUpateMarks;
import murraco.model.common.CustomerStatus;

@Entity
@Table(name = "CUSTOMERSTATUS")
@NamedQueries(value = { @NamedQuery(name = "CustomerInfoStatus.findAll", query = "SELECT c FROM CustomerInfoStatus c") })
@Access(value = AccessType.FIELD)
public class CustomerInfoStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	@Enumerated(EnumType.STRING)
	private CustomerStatus statusName;

	@Version
	private int version;

	@Embedded
	private CommonCreateAndUpateMarks commonCreateAndUpateMarks;

	public CustomerInfoStatus() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public CustomerStatus getStatusName() {
		return statusName;
	}

	public void setStatusName(CustomerStatus statusName) {
		this.statusName = statusName;
	}

	public CommonCreateAndUpateMarks getCommonCreateAndUpateMarks() {
		return commonCreateAndUpateMarks;
	}

	public void setCommonCreateAndUpateMarks(CommonCreateAndUpateMarks commonCreateAndUpateMarks) {
		this.commonCreateAndUpateMarks = commonCreateAndUpateMarks;
	}

}
