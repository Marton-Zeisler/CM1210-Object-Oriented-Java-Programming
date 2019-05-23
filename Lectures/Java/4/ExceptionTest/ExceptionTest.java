public class ExceptionTest {

    public static void main( String[] args ) {

       try {
            System.out.println( 
                    "Trying Integer.parseInt( \"NOT AN INT\" )" );
            int i = Integer.parseInt( "Not an int" );
        }
        catch ( Exception e ) {
            // System.out.println("Some error" + e);
			e.printStackTrace();
        }
        finally {
            System.out.println( "Finally always reached" );
        }

    }
}
