import java.io.FileWriter;
import java.io.PrintWriter;

class FivesWriter{
    public static void main(String[] args) {
        
        
        try {
            FileWriter writer = new FileWriter("numbers.txt", true);
            PrintWriter output = new PrintWriter(writer);
            for (int i = 1; i < 13; i++) {
                output.write(i*5 + "\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
}