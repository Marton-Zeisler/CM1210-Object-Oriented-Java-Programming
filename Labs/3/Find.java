import java.io.*;
import java.util.*;

class Find{

    private static Boolean isCaseSensitive;
    private static String keyWord;
    private static String fileName;

    public static void main(String[] args) {
        if (args.length == 3){
            isCaseSensitive = !args[0].equals("-i");
            keyWord = args[1];
            fileName = args[2];
        }else{
            isCaseSensitive = true;
            keyWord = args[0];
            fileName = args[1];
        }
        
        try{
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                if (isCaseSensitive){
                    if (strLine.contains(keyWord)){
                        System.out.println(strLine);
                    }
                }else{
                    if (strLine.toLowerCase().contains(keyWord.toLowerCase())){
                        System.out.println(strLine);
                    }
                }
            }

            fstream.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}