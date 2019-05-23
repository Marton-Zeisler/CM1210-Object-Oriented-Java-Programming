// Test program for the Journey class
public class TestJourney {
   public static void main(String[] args) {
      Journey l1 = new Journey(0, 3, 4, 0);
      System.out.println(l1);
      System.out.println(l1.getLength());
      l1.setStartXY(1, 2);
      l1.setEndXY(3, 4);
      System.out.println(l1);
 
      Location p1 = new Location(3, 0);
      Location p2 = new Location(0, 4);
      Journey l2 = new Journey(p1, p2);
      System.out.println(l2);
      System.out.println(l2.getLength());
      l2.setStart(new Location(5, 6));
      l2.setEnd(new Location(7, 8));
      System.out.println(l2);
      System.out.println(l2.getLength());
   }
}