import java.util.LinkedList;
import java.util.Scanner;

public class ContainsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l = new LinkedList <String>();
		
		l.add("Red");
		l.add("Green");
		l.add("Black");
		l.add("White");
		l.add("Pink");
		l.add("Yellow");
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Colour To Check: ");
		String x = in.nextLine();
		
		
		if (l.contains(x))
		{
			System.out.println(x + " is Present. ");
		}
		else
		{
			System.out.println(x + " is not Present. ");
		}

	}

}
