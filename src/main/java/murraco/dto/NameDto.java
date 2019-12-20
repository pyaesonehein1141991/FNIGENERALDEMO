package murraco.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class NameDto implements Serializable {
	private static final long serialVersionUID = -8381245681586350716L;

	@XmlElement(name = "firstName", required = true)
	private String firstName;

	@XmlElement(name = "middleName", required = false)
	private String middleName;

	@XmlElement(name = "lastName", required = false)
	private String lastName;

	public NameDto() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
