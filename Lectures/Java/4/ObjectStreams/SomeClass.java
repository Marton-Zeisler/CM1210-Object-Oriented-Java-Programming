import java.util.Date;
import java.io.*;

public class SomeClass implements Serializable {

    int i;
    String s;
    Date d;

    public SomeClass( int j, String t ) {
        i = j;
        s = t;
        d = new Date();
    }

    public String toString() {
        return Integer.toString(i) + s + d.toString();
    }

}