class RoomCarpet{
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension size, double carpetCost){
        this.size = size;
        this.carpetCost = carpetCost;
    }

    public double getTotalCost(){
        return size.getArea() * carpetCost;
    }
}