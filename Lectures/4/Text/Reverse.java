import java.util.Scanner;
import java.io.File;

public class Reverse {

    public static void main( String[] args ) {
	
        try {

            Scanner in = new Scanner( new File(args[0]) );

            while ( in.hasNextLine() ) {
                System.out.println( new StringBuffer(
                                      in.nextLine()).reverse() );
            }

            in.close();
        }
        catch ( Exception e ) {
            System.out.println( e );
        }
    }

}