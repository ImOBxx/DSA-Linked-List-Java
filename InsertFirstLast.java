import java.util.LinkedList;

public class InsertFirstLast {

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
		
		l.addFirst("White");
		
		l.addLast("Pink");
		
		System.out.println("New List: " + l);
		
		
		
		

	}

}
