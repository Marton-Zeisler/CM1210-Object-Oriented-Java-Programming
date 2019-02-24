import java.io.*;
import java.util.*;

class Filter{
    public static void main(String[] args) {
        String keyWord = args[0];
        String readFileName = args[1];
        String writeFileName = args[2];
        Vector<String> foundLines = new Vector<String>();
        
        try {
            FileReader fileReader = new FileReader(readFileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();

            while (line != null){
                if (line.contains(keyWord)){
                    foundLines.add(line);
                }
                line = reader.readLine();
            }
            reader.close();

            FileWriter writer = new FileWriter(writeFileName);
            PrintWriter output = new PrintWriter(writer);
            for (String each : foundLines) {
                output.write(each + "\n");
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
   }
}