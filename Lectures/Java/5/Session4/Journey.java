// The Journey class definition
public class Journey {
   // Private member variables
   Location start, end;   // Declare begin and end as instances of Location
 
   // Constructors
   public Journey(int x1, int y1, int x2, int y2) {
      start = new Location(x1, y1);  // Construct Location instances
      end   = new Location(x2, y2);
   }
   public Journey(Location start, Location end) {
      this.start = start;  // Caller constructed Location instances
      this.end   = end;
   }
 
   // Public getter and setter for private variables
   public Location getStart() {
      return start;
   }
   public Location getEnd() {
      return end;
   }
   public void setStart(Location start) {
      this.start = start;
   }
   public void setEnd(Location end) {
      this.end = end;
   }
 
   public int getStartX() {
      return start.getX();
   }
   public void setStartX(int x) {
      start.setX(x);
   }
   public int getStartY() {
      return start.getY();
   }
   public void setStartY(int y) {
      start.setY(y);
   }
   public void setStartXY(int x, int y) {
      start.setX(x);
      start.setY(y);
   }
   public int getEndX() {
      return end.getX();
   }
   public void setEndX(int x) {
      end.setX(x);
   }
   public int getEndY() {
      return end.getY();
   }
   public void setEndY(int y) {
      end.setY(y);
   }
   public void setEndXY(int x, int y) {
      end.setX(x);
      end.setY(y);
   }
 
   public String toString() {
      return "Journey from " + start + " to " + end;
   }
 
   public double getLength() {
      int xDiff = start.getX() - end.getX();
      int yDiff = start.getY() - end.getY();
      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
   }
}