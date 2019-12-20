package murraco.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class ResidentAddressDto implements Serializable {
	private static final long serialVersionUID = -2074848703209463245L;

	@XmlElement(name = "residentAddress", required = true)
	private String residentAddress;

	@XmlElement(name = "townshipId", required = true)
	private String townshipId;

	public ResidentAddressDto() {
	}

	public String getResidentAddress() {
		return residentAddress;
	}

	public void setResidentAddress(String residentAddress) {
		this.residentAddress = residentAddress;
	}

	public String getTownshipId() {
		return townshipId;
	}

	public void setTownshipId(String townshipId) {
		this.townshipId = townshipId;
	}

}