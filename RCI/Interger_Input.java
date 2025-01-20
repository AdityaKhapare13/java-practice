package RCI;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Interger_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b= sc.nextInt();
			sc.close();
			System.out.println(a/b);
		}catch( ArithmeticException e) {
			System.out.println("denominator is zero");
		}
		catch(InputMismatchException f) {
			System.out.println("number is not a integer");
		}
	}
}
