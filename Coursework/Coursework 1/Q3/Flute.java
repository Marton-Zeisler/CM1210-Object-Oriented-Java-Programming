class Flute extends Woodwind implements Instruments{

	private String name;
	private double price;
	private String famousMusician;
	private boolean isBothEndOpen;	
	
	public Flute(String instrumentName, double instrumentPrice, String instrumentFamousMusician,  boolean isBothEndOpen, String woodWindType, String material, String soundProductionMethod){
		super(woodWindType, material, soundProductionMethod);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.isBothEndOpen = isBothEndOpen;
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
	
	public boolean getIsBothEndOpen(){
		return isBothEndOpen;
	}
	
	public void setIsBothEndOpen(boolean isBothEndOpen){
		this.isBothEndOpen = isBothEndOpen;
	}

}