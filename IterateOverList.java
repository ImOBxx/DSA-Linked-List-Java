import java.util.LinkedList;

public class IterateOverList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l  = new LinkedList <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Pink");
		l.add("Yellow");
		
		for (String element : l)
		{
			System.out.println(element);
		}
		

	}

}
