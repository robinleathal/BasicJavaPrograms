
public class Salary {

	double salary = 85000;
	//20%
	double taxRate =  0.20;
	double tax;
	
	public double calculateTax( ) {
		tax = salary * taxRate;
		return tax;
		
	}

}
