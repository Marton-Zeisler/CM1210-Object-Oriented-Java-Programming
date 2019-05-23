import java.io.*;

public class ReaderTest {

    public static void main( String[] args ) {

        try {

            FileReader reader = new FileReader( "test.txt" );
            BufferedReader in = new BufferedReader( reader );

            String s;
            while ( (s = in.readLine()) != null ) {
                System.out.println( new StringBuffer(s).reverse() );
            }

            in.close();
        }
        catch ( FileNotFoundException e ) { // may be throw by new FileReader(...)
            System.out.println( e );
        }
        catch ( IOException e ) {  // may be thrown by readLine()
            System.out.println( e );
        }
    }

}