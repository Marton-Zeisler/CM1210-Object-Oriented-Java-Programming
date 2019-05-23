import java.util.Scanner;
import java.io.File;

public class Sum {

	public static void main( String[] args ) {
		
		try {
			Scanner in = new Scanner( new File(args[0]) );
			
			double total = 0;
			while (in.hasNextDouble()) {
				total += in.nextDouble();
			}
			
			System.out.printf( "Sum is %.4f%n", total );
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
			