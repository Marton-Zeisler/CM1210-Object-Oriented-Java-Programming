import java.io.*;

class ReaderTest {
    public static void main(String[] args) {

        try {
            FileReader in = new FileReader("bestpicturefilms.txt");
            BufferedReader br = new BufferedReader(in);
            String line = br.readLine();

            double highest = 0;
            double lowest = Double.MAX_VALUE;
            double average = 0;
            double total = 0;
            double lines = 0;

            while (line!=null) {
                lines += 1;
                if (line.length() > highest){
                    highest = line.length();
                }

                if (line.length() < lowest){
                    lowest = line.length();
                }

                total += line.length();
                line = br.readLine();
            }
            average = total / lines;
            System.out.println("Smallest: " + lowest);
            System.out.println("Largest: " + highest);
            System.out.println("Average: " + average);

            in.close();
        } catch (Exception e) {
            System.out.println("Error");
        }


    }
}