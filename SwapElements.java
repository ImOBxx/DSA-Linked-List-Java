import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l = new LinkedList <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("Original Linked List: " + l);
		
		Collections.swap(l, 0, 2);
		
		System.out.println("The New Linked List: " + l);

	}

}
