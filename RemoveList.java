import java.util.LinkedList;

public class RemoveList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l = new LinkedList <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		System.out.println("The Original linked list: " + l);
		
		l.remove(2);
		
		System.out.println("The New linked list: " + l);
		

	}

}
