import java.util.LinkedList;

public class InsertMultiple {

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
		
		LinkedList <String> l2 = new LinkedList <String>();
		
		l2.add("White");
		
		l2.add("Pink");
		
		l.addAll(1, l2);
		
		System.out.println("Linked List: " + l);

	}

}
