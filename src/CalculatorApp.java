import java.util.Scanner;

public class CalculatorApp {

	int num1, num2, result;
	static Scanner sc = new Scanner(System.in);

	void add() {
		System.out.println("Enter num1");
		num1 = sc.nextInt();

		System.out.println("Enter num2");
		num2 = sc.nextInt();
		result = num1 + num2;
		System.out.println("Addition of " + num1 + " & " + num2 + " = " + result);
	}

	void sub() {
		System.out.println("Enter num1");
		num1 = sc.nextInt();

		System.out.println("Enter num2");
		num2 = sc.nextInt();
		result = num1 - num2;
		System.out.println("Substraction of " + num1 + " & " + num2 + " = " + result);
	}

	void mul() {
		System.out.println("Enter num1");
		num1 = sc.nextInt();

		System.out.println("Enter num2");
		num2 = sc.nextInt();
		result = num1 * num2;
		System.out.println("Multiplication of " + num1 + " & " + num2 + " = " + result);
	}

	void div() {
		System.out.println("Enter num1");
		num1 = sc.nextInt();

		System.out.println("Enter num2");
		num2 = sc.nextInt();
		result = num1 / num2;
		System.out.println("Division of " + num1 + " & " + num2 + " = " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(Scanner.in);
		CalculatorApp obj = new CalculatorApp();
		while (true) {
			System.out.println("***************");
			System.out.println("Add");
			System.out.println("Sub");
			System.out.println("Mul");
			System.out.println("Div");
			System.out.println("Exit");
			System.out.println("***************");

			System.out.println("Enter your choice.");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.add();
				break;
			case 2:
				obj.sub();
				break;
			case 3:
				obj.mul();
				break;
			case 4:
				obj.div();
				break;

			case 5:
				System.out.println("Thank you for using this app");
				System.exit(0);
			default:
				System.out.println("Choices should be between 1 and 5");
			}
		}

	}

}
