package murraco.dto;

import java.util.ArrayList;
import java.util.List;
public class ResponseListDTO {
	List<String> policyNoList;

	public List<String> getPolicyNoList() {
		if(null != policyNoList) {
			return policyNoList;
		}else {
			return new ArrayList<>();
		}
	}

	public void setPolicyNoList(List<String> policyNoList) {
		this.policyNoList = policyNoList;
	}

	
}
