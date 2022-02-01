import java.util.Scanner;

public class ArmstrongNumber {
	int number, originalNumber, remainder, result;
	public void isArmstrongNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get armstrongnumber");
		number = sc.nextInt();
		originalNumber = number;
		sc.close();
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		
		if(result == number) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");

		}
		
	}

}
