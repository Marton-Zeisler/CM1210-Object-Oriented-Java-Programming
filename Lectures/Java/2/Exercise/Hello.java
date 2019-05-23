import java.util.*;

public class Hello{
    enum loopType{
        FOR,
        WHILE,
        DO
    }

    public static void main(String[] args) {    
        new Hello().startLoop(loopType.DO);
    }

    public void startLoop(loopType loop){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of marks: ");
        int numberOfMarks = input.nextInt();

        if (loop == loopType.FOR){
            double average = new Hello().usingFor(numberOfMarks, input);
            System.out.println("Your average is: " + Double.toString(average));
        }else if (loop == loopType.WHILE){
            double average = new Hello().usingWhile(numberOfMarks, input);
            System.out.println("Your average is: " + Double.toString(average));
        }else{
            double average = new Hello().usingDoWhile(numberOfMarks, input);
            System.out.println("Your average is: " + Double.toString(average));
        }
    }

    public double usingFor(int numberOfMarks, Scanner input){
        double total = 0;

        for (int i = 0; i < numberOfMarks; i++) {
            double newMark = input.nextDouble();
            total += newMark;
        }

        return total / numberOfMarks;
    }

    public double usingWhile(int numberOfMarks, Scanner input){
        int counter = 0;
        double total = 0;

        while (counter < numberOfMarks){
            double newMark = input.nextDouble();
            total += newMark;
            counter += 1;
        }
        
        return total / numberOfMarks;
    }

    public double usingDoWhile(int numberOfMarks, Scanner input){
        int counter = 0;
        double total = 0;

        do {
            double newMark = input.nextDouble();
            total += newMark;
            counter += 1;
        } while (counter < numberOfMarks);

        return total / numberOfMarks;
    }

}