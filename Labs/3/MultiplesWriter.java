import java.io.*;

class MultiplesWriter{
    public static void main(String[] args) {
        int numberTimes = Integer.parseInt(args[0]);
        String fileName = args[1];

        try {
            FileWriter writer = new FileWriter(fileName);
            PrintWriter output = new PrintWriter(writer);
            
            for (int i = 1; i < 13; i++) {
                output.write(i + " * " + numberTimes+ " = " + i*numberTimes + "\n");
            }

            output.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}