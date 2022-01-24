import java.util.Scanner;

public class LeapYear {
	int year;
	public void isLeapYear() {
		try (Scanner sc = new Scanner(System.in)) {
			year = sc.nextInt();
			if (((year % 4 == 0) && (year % 100!=0)) || (year%400 == 0)) {
				System.out.println( year+" is a leap year");
				
			} else {
				System.out.println(year+ " it is not a leap year");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		// TODO Auto-generated constructor stub
	}

}
