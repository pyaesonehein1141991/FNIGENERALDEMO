package murraco.model.common;
public enum IdConditionType {
	N("N"), P("P"), E("E"), A("A"), D("D");

	private String label;

	private IdConditionType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}