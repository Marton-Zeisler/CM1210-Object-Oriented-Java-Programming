import java.util.*;

class ReverseInputs{

    private static Vector<String> sentences = new Vector<String>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PLEASE ENTER TEXT. ENTER A BLANK LINE WHEN YOU ARE FINISHED");
        enterInput();

        System.out.println("YOUR INPUT REVERSED:");
        reverseInput();
    }

    private static void enterInput(){
        String line = input.nextLine();
        if (line.length() > 0){
            sentences.add(line);
            enterInput();
        }
    }

    private static void reverseInput(){
        for (String each : sentences) {
            System.out.println(new StringBuilder(each).reverse().toString());
        }
    }
}