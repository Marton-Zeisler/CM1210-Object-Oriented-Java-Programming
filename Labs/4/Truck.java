class Truck extends Vehicle{
    private double loadCapacity;
    private int towingCapacity;

    public Truck(String manufacturer, int cylinders, Person owner, double loadCapacity, int towingCapacity){
        super(manufacturer, cylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }
}