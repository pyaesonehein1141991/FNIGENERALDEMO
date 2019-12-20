package murraco.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class OfficeAddressDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "officeAddress", required = false)
	private String officeAddress;

	@XmlElement(name = "townshipId", required = false)
	private String townshipId;

	public OfficeAddressDto() {
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getTownshipId() {
		return townshipId;
	}

	public void setTownshipId(String townshipId) {
		this.townshipId = townshipId;
	}

	public void getFullTownShip() {

	}

}