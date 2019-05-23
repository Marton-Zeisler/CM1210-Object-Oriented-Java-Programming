class Drum extends Percussion implements Instruments {
	
	private String name;
	private double price;
	private String famousMusician;
	private boolean playedIndividually;

	public Drum(String instrumentName, double instrumentPrice, String instrumentFamousMusician, boolean playedIndividually, String percussionClass, String soundProductionMethod, String orchestration, String percussaveBeater){
		super(percussionClass, soundProductionMethod, orchestration, percussaveBeater);
		name = instrumentName;
		price = instrumentPrice;
		famousMusician = instrumentFamousMusician;
		this.playedIndividually = playedIndividually;
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
	
	public boolean getPlayedIndividually(){
		return playedIndividually;
	}
	
	public void setPlayedIndividually(boolean playedIndividually){
		this.playedIndividually = playedIndividually;
	}
}