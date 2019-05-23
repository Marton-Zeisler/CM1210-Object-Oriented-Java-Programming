// LinearSearchTest.java
// Test for a linear search method.
public class LinearSearchTest {

   public static void main( String[] args ) {

      // Create array to test algorithm.
      int[] array = { 7, 101, 9, 142, 23, 112, 82, 54, 125, 131, 0, 151 };
      int result;
      int key;

      key = 82;
      result = Search.linearSearch( array, key );
      if ( result >= 0 ) {
         System.out.println( key + " found at element " + result );
      } else {
         System.out.println( key + " not found." );
      }
      System.out.println();

      key = 129;
      result = Search.linearSearch( array, key );
      if ( result >= 0 ) {
         System.out.println( key + " found at element " + result );
      } else {
         System.out.println( key + " not found." );
      }

   }
}