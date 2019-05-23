public class Search {

    // Method to search an int array using
    // linear search algorithm.
    public static int linearSearch( int[] a, int key ) {
        for (int i = 0; i < a.length; ++i) {
            Output.printArrayWithHighlight( a, i, a.length - 1, i );
            if ( a[i] == key ) {
                return i;
            }
        }
        return -1;
    }
}