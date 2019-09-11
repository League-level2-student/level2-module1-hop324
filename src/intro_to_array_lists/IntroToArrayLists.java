package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> Yeet = new ArrayList<String>();
		//2. Add five Strings to your list
		Yeet.add("My");
		Yeet.add("name");
		Yeet.add("is");
		Yeet.add("Jeff");
		Yeet.add(".");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = Yeet.size(); i > 0; i--) {
			String j = Yeet.get(i);
			System.out.println(j);
		}
		//4. Print all the Strings using a for-each loop
		for(String k : Yeet){
			System.out.println(k);
		}
		//5. Print only the even numbered elements in the list.
		for(int h = Yeet.size(); h > 0; h--) {
			if(h%2 == 0) {
				String o = Yeet.get(h);
				System.out.println(o);
			}
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
