import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<PhoneBookEntry> entries;

    public PhoneBook( ) {
        entries = new ArrayList<PhoneBookEntry>();
    }

    public void add( String name, String number ) {
		entries.add(new PhoneBookEntry(name, number));
    }

    public String numberFor( String name ) {
        for (int i = 0; i < entries.size(); ++i) {
            if ( entries.get(i).getName().equals(name) ) {
                return entries.get(i).getNumber();
            }
        }
        return "NOT FOUND";
    }

    public String toString( ) {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < entries.size(); ++i) {
            temp.append( entries.get(i).toString() + "\n" );
        }
        return temp.toString();
    }

}