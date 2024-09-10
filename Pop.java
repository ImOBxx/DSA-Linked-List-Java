import java.util.LinkedList;

public class Pop {

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
		
		System.out.println("Removed Element: " + l.pop());
		
		System.out.println("Linked list after pop operation: "+ l);
	  
		
		

	}

}
