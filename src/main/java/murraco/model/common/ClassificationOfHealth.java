package murraco.model.common;
public enum ClassificationOfHealth {
	FIRSTCLASS("FIRSTCLASS"),SECONDCLASS("SECONDCLASS"), THIRDCLASS("THIRDCLASS");
	
	private String label;
	
	public String getLabel() {
		return label;
	}
	
	private ClassificationOfHealth(String label){
		this.label= label;
	}
	
}
