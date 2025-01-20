package RCI;
import java.util.*;

public class nullPointerException {
	public static void main(String[] args) {
		String text= null;
		try {
			System.out.println(text.length());
		}catch(NullPointerException e) {
			System.out.println("Please enter the name properly");
		}
		finally {
			System.out.println("this is finally block");
			
		}
		
		
	}
	
	

	
}
