// The Location class definition
public class Location {
   // Private member variables
   private int x, y;   // (x, y) location co-ordinates
 
   // Constructors
   public Location(int x, int y) {
      this.x = x;
      this.y = y;
   }
   public Location() {    // default constructor
      x = 0;
      y = 0;
   }
 
   // access specifier methods for private variables
   public int getX() { 
      return x; 
   }
   public void setX(int x) { 
      this.x = x; 
   }
   public int getY() { 
      return y; 
   }
   public void setY(int y) { 
      this.y = y; 
   }
 
   // toString() to describe how to output a location
   public String toString() { 
      return "(" + x + "," + y + ")"; 
   }
}