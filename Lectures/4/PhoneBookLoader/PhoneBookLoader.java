import java.util.Scanner;
import java.io.File;

public class PhoneBookLoader {

    public static PhoneBook loadPhoneBook( String filename ) throws Exception {
        File fileIn = new File( filename );
        
        try {
            Scanner in = new Scanner( fileIn );
            PhoneBook book = new PhoneBook();
            
            while( in.hasNextLine() ) {
                // Get a line of the text file
                String line = in.nextLine();
                
                // Separate the line into name and number
                String[] parts = line.split(",");
                String name = parts[0];
                String number = parts[1];
                
                // Create an entry and add it to the phone book
                book.add( name, number );
            }
            in.close();
            
            return book;
        }
        catch( Exception e ) {
            System.out.println( "Problem reading file: " + filename );
            throw e;  // re-raise exception
        }
    }
    
    public static void main( String[] args ) {
        try {
            
            String filename = args[0];
            PhoneBook pb = loadPhoneBook( filename );
            System.out.println( pb );
        }
        catch( Exception e ) {
            // Do nothing
        }
    }
}
