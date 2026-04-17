package session_09.classroom.aslist;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {
	public static void main(String[] args) {
		Character ch[] = { 'a', 'e', 'i', 'o', 'u' };
		List <Object> charList = Arrays.asList((Object[]) ch);

		System.out.println("Elements in character list----");
		
		System.out.println(charList);
		
//		charList.set(1,"z"); // ArrayStoreException
//		charList.add('e'); // UnsupportedOperationException
//		charList.remove(0); // UnsupportedOperationException
		charList.forEach(x ->{System.out.print(x);});
		
	}
}
