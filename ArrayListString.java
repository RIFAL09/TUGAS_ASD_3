import java.util.ArrayList;

public class ArrayListString {
	
	public static void main(String[] args) {
		ArrayList<String>string = new ArrayList<String>();
		string.add("rifal");
		string.add("mail");
		string.add("alibaba");
		
    System.out.println(string.toString());
		System.out.println("index of rifal : "+string.indexOf("rifal"));
		
    string.remove(1);
		System.out.println(string.toString());
		System.out.println("SIZE : "+string.size());	
	}
}
