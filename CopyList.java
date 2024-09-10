import java.util.LinkedList;

public class CopyList {

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
		
		l2 = (LinkedList<String>) l.clone();
		
		System.out.println("Linked List 1: " + l2);
		
		
		
		
		
		
	    
	    

	}

}
