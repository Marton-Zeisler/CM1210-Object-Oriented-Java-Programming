class Violin extends StringInstruments implements Instruments{
	
	private String name;
	private double price;
	private String famousMusician;
	private double bowSize;
	
	public Violin(String instrumentName, double instrumentPrice, String instrumentFamousMusician, double bowSize, String stringMethod, String stringType, String constructionType, String playingTechnique){
		super(stringMethod, stringType, constructionType, playingTechnique);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.bowSize = bowSize;
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
	
	public double getBowSize(){
		return bowSize;
	}
	
	public void setBowSize(double bowSize){
		this.bowSize = bowSize;
	}
	
}