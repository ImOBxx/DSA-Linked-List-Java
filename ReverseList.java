import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l = new LinkedList <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("Original List: " + l);
		
		Iterator it = l.descendingIterator();
		
		System.out.println("Elements In Reverse Order: ");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		

	}

}
