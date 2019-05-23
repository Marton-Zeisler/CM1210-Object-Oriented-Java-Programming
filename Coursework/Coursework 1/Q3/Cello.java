class Cello extends StringInstruments implements Instruments{
	
	private String name;
	private double price;
	private String famousMusician;
	private boolean isHandCarved;
	
	public Cello(String instrumentName, double instrumentPrice, String instrumentFamousMusician,  boolean isHandCarved, String stringMethod, String stringType, String constructionType, String playingTechnique){
		super(stringMethod, stringType, constructionType, playingTechnique);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.isHandCarved = isHandCarved;
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
	
	public boolean getIsHandCarved(){
		return isHandCarved;
	}
	
	public void setIsHandCarved(boolean isHandCarved){
		this.isHandCarved = isHandCarved;
	}
	
}