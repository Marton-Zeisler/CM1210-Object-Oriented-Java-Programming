class Percussion {
	private String percussionClass;
	private String soundProductionMethod;
	private String orchestration;
	private String percussaveBeater;

	public Percussion(String percussionClass, String soundProductionMethod, String orchestration, String percussaveBeater) {
		this.percussionClass = percussionClass;
		this.soundProductionMethod = soundProductionMethod;
		this.orchestration = orchestration;
		this.percussaveBeater = percussaveBeater;
	}

	public String getPercussionClass() {
		return percussionClass;
	}

	public void setPercussionClass(String percussionClass) {
		this.percussionClass = percussionClass;
	}

	public String getSoundProductionMethod() {
		return soundProductionMethod;
	}

	public void setSoundProductionMethod(String soundProductionMethod) {
		this.soundProductionMethod = soundProductionMethod;
	}

	public String getOrchestration() {
		return orchestration;
	}

	public void setOrchestration(String orchestration) {
		this.orchestration = orchestration;
	}

	public String getPercussaveBeater() {
		return percussaveBeater;
	}

	public void setPercussaveBeater(String percussaveBeater) {
		this.percussaveBeater = percussaveBeater;
	}
}