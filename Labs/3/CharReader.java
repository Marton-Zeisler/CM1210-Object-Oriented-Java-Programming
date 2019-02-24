import java.io.*;

class CharReader {
    public static void main(String[] args) {
        
        try {
            FileReader reader = new FileReader("alphabet.txt");

            int readerInt = reader.read();

            while (readerInt != -1){
                System.out.print((char)readerInt);
                readerInt = reader.read();
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}


