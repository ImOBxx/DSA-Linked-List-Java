import java.util.LinkedList;

public class JoinTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l = new LinkedList <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("Linked List 1: " + l);
		
		LinkedList <String> l2 = new LinkedList <String>();
		
		l2.add("Red");
		l2.add("Green");
		l2.add("Black");
		l2.add("White");
		
		System.out.println("Linked List 2: " + l2);
		
		LinkedList <String> l3 = new LinkedList <String>();
		
		l3.addAll(l);
		l3.addAll(l2);
		
		System.out.println("Linked List 3: " + l3);
		

	}

}
