class Clarinet extends Woodwind implements Instruments{

	private String name;
	private double price;
	private String famousMusician;
	private String clarinetFamily;	
	
	public Clarinet(String instrumentName, double instrumentPrice, String instrumentFamousMusician, String clarinetFamily, String woodWindType, String material, String soundProductionMethod){
		super(woodWindType, material, soundProductionMethod);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.clarinetFamily = clarinetFamily;
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
	
	public String getClarinetFamily(){
		return clarinetFamily;
	}
	
	public void setClarinetFamily(String clarinetFamily){
		this.clarinetFamily = clarinetFamily;
	}

}