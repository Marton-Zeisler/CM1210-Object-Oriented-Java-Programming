class StringInstruments{
	
	private String stringMethod;
	private String stringType;
	private String constructionType;
	private String playingTechnique;

	public StringInstruments(String stringMethod, String stringType, String constructionType, String playingTechnique) {
		this.stringMethod = stringMethod;
		this.stringType = stringType;
		this.constructionType = constructionType;
		this.playingTechnique = playingTechnique;
	}

	public String getStringMethod() {
		return stringMethod;
	}

	public void setStringMethod(String stringMethod) {
		this.stringMethod = stringMethod;
	}

	public String getStringType() {
		return stringType;
	}

	public void setStringType(String stringType) {
		this.stringType = stringType;
	}

	public String getConstructionType() {
		return constructionType;
	}

	public void setConstructionType(String constructionType) {
		this.constructionType = constructionType;
	}

	public String getPlayingTechnique() {
		return playingTechnique;
	}

	public void setPlayingTechnique(String playingTechnique) {
		this.playingTechnique = playingTechnique;
	}
}