package by.academy.deal;

public enum DealStatus {
	NEW("New"), IN_PROGRESS("In Progress"), DONE("Done");

	private String value;

	private DealStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
