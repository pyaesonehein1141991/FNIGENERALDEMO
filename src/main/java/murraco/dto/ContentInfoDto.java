package murraco.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class ContentInfoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "phone", required = false)
	private String phone;

	@XmlElement(name = "fax", required = false)
	private String fax;

	@XmlElement(name = "mobile", required = false)
	private String mobile;

	@XmlElement(name = "email", required = false)
	private String email;

	public ContentInfoDto() {
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}