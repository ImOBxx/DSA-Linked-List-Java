import java.util.LinkedList;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> l = new LinkedList<String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("Original Linked List: " + l);
		
		l.add(1, "Yellow");
		
		System.out.println("New Linked List: " + l);
		
		
		
		
		

	}

}
