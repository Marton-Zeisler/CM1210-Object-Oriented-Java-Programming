import java.util.*;

public class RewriteNumber {
	public static void main( String args[] ) {
	    Scanner in = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = in.nextInt();
	    
	    if (num == 0){
			System.out.println("Zero");
		}else if (num == 1){
			System.out.println("One");
		}else if (num == 2){
			System.out.println("Two");
		}else if (num == 3){
			System.out.println("Three");
		}else if (num == 4){
			System.out.println("Four");
		}

		switch (num){
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			default:
				System.out.println("Nine");
		}



	}
}
