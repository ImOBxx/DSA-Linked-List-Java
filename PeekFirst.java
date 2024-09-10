import java.util.LinkedList;

public class PeekFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        LinkedList<Integer> list = new LinkedList<>();

		        // Add elements to the LinkedList
		        list.add(1);
		        list.add(2);
		        list.add(3);

		        // Use peekFirst() to get the first element
		        Integer firstElement = list.peekFirst();
		        Integer le = list.peekLast();

		        // Check if the list is not empty before accessing the first element
		        if (firstElement != null) {
		            System.out.println("First element is: " + firstElement);
		            System.out.println("Last element is: " + le);
		         
		        } else {
		            System.out.println("The list is empty.");
		        }
		    


	}

}
