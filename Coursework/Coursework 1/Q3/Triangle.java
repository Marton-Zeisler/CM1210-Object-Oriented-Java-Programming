class Triangle extends Percussion implements Instruments {
	
	private String name;
	private double price;
	private String famousMusician;
	private String metalType;

	public Triangle(String instrumentName, double instrumentPrice, String instrumentFamousMusician, String metalType, String percussionClass, String soundProductionMethod, String orchestration, String percussaveBeater){
		super(percussionClass, soundProductionMethod, orchestration, percussaveBeater);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.metalType = metalType;
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
	
	public String getMetalType(){
		return metalType;
	}
	
	public void setMetalType(String metalType){
		this.metalType = metalType;
	}
}