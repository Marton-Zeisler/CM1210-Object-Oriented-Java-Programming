// Output.java
// A class providing useful methods for output.
public class Output {

   public static void printArray( int[] a ) {
       printArray( a, ", " );
   }

   public static void printArray( int[] a, String separator ) {
      for ( int i = 0; i < a.length; ++i ) {
         System.out.print( a[i] );
         if ( i < a.length - 1 )
            System.out.print( separator );
      }
      System.out.println();
   }

    // Method to output elements i to j of the array a, highlighting
    // the element highlight. Note the formating is only valid for
    // ints of at most 3 digits.
    public static void printArrayWithHighlight( int[] a, int i,
	                                            int j, int highlight ) {
        for (int k = 0; k < a.length; ++k) {
            if (k < i || k > j) {
                System.out.print( "     " );
            } else if (k == highlight) {
                System.out.printf( "[%3d]", a[k] );
            } else {
                System.out.printf( " %3d ", a[k] );
            }
        }
        System.out.println();
    }
}