import java.io.*;

public class WriteTest {

    public static void main( String[] args ) {

        SomeClass sc = new SomeClass( 15, "bob" );
        System.out.println( sc );

        try {
            ObjectOutputStream out = new ObjectOutputStream
                ( new FileOutputStream( "matt.dat" ) );
            out.writeObject(sc);
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
