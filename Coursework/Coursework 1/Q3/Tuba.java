class Tuba extends Brass implements Instruments{
	
	private String name;
	private double price;
	private String famousMusician;
	private boolean isCapableMarching;
	
	public Tuba(String instrumentName, double instrumentPrice, String instrumentFamousMusician, boolean isCapableMarching, double mouthPieceDiameter, double mouthPieceWidth, String brassFamily, boolean isCylindrical, boolean isWholeTube){
		super(mouthPieceDiameter, mouthPieceWidth, brassFamily, isCylindrical, isWholeTube);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.isCapableMarching = isCapableMarching;
	}
	
	public String getInstrumentName(){
		return name;
	}
	
	public double getInstrumentPrice(){
		return price;
	}
	
	public String getFamousMusician(){
		return famousMusician;
	}
	
	public boolean getIsCapableMarching(){
		return isCapableMarching;
	}
	
	public void setIsCapableMarching(boolean isCapableMarching){
		this.isCapableMarching = isCapableMarching;
	}
}