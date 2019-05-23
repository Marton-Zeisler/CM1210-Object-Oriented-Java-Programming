class Woodwind {

	private String woodWindType;
	private String material;
	private String soundProductionMethod;

	public Woodwind(String woodWindType, String material, String soundProductionMethod) {
		this.woodWindType = woodWindType;
		this.material = material;
		this.soundProductionMethod = soundProductionMethod;
	}

	public String getWoodWindType() {
		return woodWindType;
	}

	public void setWoodWindType(String woodWindType) {
		this.woodWindType = woodWindType;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSoundProductionMethod() {
		return soundProductionMethod;
	}

	public void setSoundProductionMethod(String soundProductionMethod) {
		this.soundProductionMethod = soundProductionMethod;
	}
}