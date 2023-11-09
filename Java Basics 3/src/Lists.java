import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Mika");
		names.add("Pia");
		names.add("Kaija");
		
		System.out.println(names.get(2));
		names.remove(2);
		
		for (int i= 0; i < names.size(); i++) {
			
		  System.out.println(names.get(i));
		}

	}

}
