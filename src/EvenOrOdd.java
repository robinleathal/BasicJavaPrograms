import java.util.Scanner;

public class EvenOrOdd {

	int firstNumber;
	
	
	public void evenOrOdd() {
		try (Scanner sc = new Scanner(System.in)) {
			firstNumber = sc.nextInt();
			if (firstNumber %2 == 0) {
				System.out.println("The number you entered " +firstNumber + " is even number");
			} else {
				System.out.println("The number you entered " +firstNumber + " is an odd number");
			}
		} catch (Exception e){
			e.getMessage();
			
		}
		
	}

}
