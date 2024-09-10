import java.util.LinkedList;

public class DisplayIndex {

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
		
		for (int p = 0; p < l.size(); p++)
		{
			System.out.println("Elements At Index: " + p + ": " + l.get(p));
		}
		

	}

}
