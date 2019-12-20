package murraco.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import murraco.model.Role;

public class UserResponseDTO {

  @ApiModelProperty(position = 0)
  private Integer id;
  @ApiModelProperty(position = 1)
  private String username;
  @ApiModelProperty(position = 2)
  private String email;
  @ApiModelProperty(position = 3)
  List<Role> roles;
  
  private String fatherName;
	private String dateOfBirth;
	private String gender;
	private String address;
	private String phoneNo;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

public String getFatherName() {
	return fatherName;
}

public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}

public String getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
  
  

}
