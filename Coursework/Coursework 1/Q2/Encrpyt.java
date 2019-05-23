import java.io.*;

class Encrpyt {
	public static void main(String[] args) {
		
		writeString();
		
		String text = readString();
		if(text == null){
			System.out.println("There was a problem with reading the Secret.dat file");
		}else{
			String encrypted = getEncrypted(text);
			System.out.println("Encrypted:\n");
			System.out.println(encrypted);
			
			System.out.println("Original:\n");
			System.out.println(text);
		}
		
	}
	
	public static String getEncrypted(String text){
		String encrypted = "";
		
		String lines[] = text.split("\n");
		for(String line: lines){
			char characters[] = line.toCharArray();
			for(char character: characters){
				if(Character.isLetter(character) && Character.isLowerCase(character)){
					int ascii = (int) character;
					if(ascii == 97){
						ascii = 122;
					}else if(ascii == 122){
						ascii = 97;
					}else{
						ascii--;
					}
					
					encrypted += (char) ascii;
				}else{
					encrypted += character;
				}
			}
			encrypted += "\n";
		}
		
		return encrypted;
	}
	
	public static String readString(){
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Secret.dat"));
			String text = (String)in.readObject();
			in.close();
			return text;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public static void writeString(){
		String string = "Hey there!\nHow are you?";
		try {
			ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("Secret.dat"));
			in.writeObject(string);
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}