import java.util.*;

class AddNumbers {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int number1 = getIntInput();
		int number2 = getIntInput();
		System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
	}
	
	public static int getIntInput(){
		System.out.print("Enter a number: ");
		return scanner.nextInt();
	}
}