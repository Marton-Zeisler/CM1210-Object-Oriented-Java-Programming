class Trumpet extends Brass implements Instruments{
	
	private String name;
	private double price;
	private String famousMusician;
	private String type;
	
	public Trumpet(String instrumentName, double instrumentPrice, String instrumentFamousMusician, String type, double mouthPieceDiameter, double mouthPieceWidth, String brassFamily, boolean isCylindrical, boolean isWholeTube){
		super(mouthPieceDiameter, mouthPieceWidth, brassFamily, isCylindrical, isWholeTube);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.type = type;
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
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	
}