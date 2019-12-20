package murraco.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class PermanentAddressDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "permanentAddress", required = true)
	private String permanentAddress;

	@XmlElement(name = "townshipId", required = true)
	private String townshipId;

	public PermanentAddressDto() {
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
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
