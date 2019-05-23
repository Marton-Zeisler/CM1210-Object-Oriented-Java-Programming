import java.io.*;
import java.util.Date;

public class WriterTest {

    public static void main( String[] args ) {

        try {

            FileWriter writer = new FileWriter( args[0] );
            PrintWriter out = new PrintWriter( writer );

            out.println( "Hello world!" );
            out.print( new Date() );
            out.println();

            out.close();
        }
        catch ( Exception e ) {
            System.out.println( e );
        }
    }

}