import java.util.Scanner;

public class JavaPrograms {
	static char ch;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary salaryObj = new Salary();
		
		System.out.println("Tax on 85000 at 20% = " +salaryObj.calculateTax());
		Dominos dominosObj = new Dominos();
		
		System.out.println("Final bill after discount = "+dominosObj.calculateBill());
		
		JioFiberPlan planObj = new JioFiberPlan();
		System.out.println("Final cost for Jio Silver plan cost = " + planObj.calculateFinalPlanCost());
		Interest interestObj = new Interest();
		System.out.println("Interest = "+interestObj.calculateInterest());
		System.out.println("final Amount = "+interestObj.finalAmount());
		System.out.println("Enter 'e' to check even odd  or 'l' for Leap year ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if (ch == 'e'){
			System.out.println("Enter first Number to check");
			EvenOrOdd objOddEven = new EvenOrOdd();
			objOddEven.evenOrOdd() ;
		} else if (ch == 'l') {
			System.out.println("Enter Year to check leap year");
			LeapYear ObjLeap = new LeapYear();
			ObjLeap.isLeapYear();
		} else {
			ArmstrongNumber armstrongObj = new ArmstrongNumber();
			armstrongObj .isArmstrongNumber();
		}
		
		
		
	}

}
