import java.util.LinkedList;

public class FIrstLastOcc {

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
		
		Object fl =l.getFirst();
		System.out.println("First Element: " + fl);
		
		Object ll = l.getLast();
		System.out.println("Last Element: " + ll);
		
		

	}

}
