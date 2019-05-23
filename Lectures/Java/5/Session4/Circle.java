// Define the Circle class
public class Circle {
   // Private variables
   private double radius;
   private String color;
   
   // Constructors (overloaded)
   public Circle() { 
      radius = 1.0;
      color = "red";
   }
   public Circle(double r) {
      radius = r;
      color = "red";
   }
   public Circle(double r, String c) {
      radius = r;
      color = c;
   }
   
   // Public methods
   public double getRadius() {
      return radius;
   }
   public String getColor() {
      return color;
   }
   public double getArea() {
      return radius*radius*Math.PI;
   }
}
