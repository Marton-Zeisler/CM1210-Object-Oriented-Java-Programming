class Brass{
	private double mouthPieceDiameter;
	private double mouthPieceWidth;
	private String brassFamily;
	private boolean isCylindrical;
	private boolean isWholeTube;

	public Brass(double mouthPieceDiameter, double mouthPieceWidth, String brassFamily, boolean isCylindrical, boolean isWholeTube) {
		this.mouthPieceDiameter = mouthPieceDiameter;
		this.mouthPieceWidth = mouthPieceWidth;
		this.brassFamily = brassFamily;
		this.isCylindrical = isCylindrical;
		this.isWholeTube = isWholeTube;
	}

	public double getMouthPieceDiameter() {
		return mouthPieceDiameter;
	}

	public void setMouthPieceDiameter(double mouthPieceDiameter) {
		this.mouthPieceDiameter = mouthPieceDiameter;
	}

	public double getMouthPieceWidth() {
		return mouthPieceWidth;
	}

	public void setMouthPieceWidth(double mouthPieceWidth) {
		this.mouthPieceWidth = mouthPieceWidth;
	}

	public String getBrassFamily() {
		return brassFamily;
	}

	public void setBrassFamily(String brassFamily) {
		this.brassFamily = brassFamily;
	}

	public boolean isCylindrical() {
		return isCylindrical;
	}

	public void setCylindrical(boolean cylindrical) {
		isCylindrical = cylindrical;
	}

	public boolean isWholeTube() {
		return isWholeTube;
	}

	public void setWholeTube(boolean wholeTube) {
		isWholeTube = wholeTube;
	}
	
}