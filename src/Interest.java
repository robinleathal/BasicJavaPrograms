
public class Interest {

	double deposit = 500000;
	int years = 5;
	double ratePerYear = 0.068;
	double interest;
	double finalAmount;
	public double calculateInterest(){
		interest = (deposit * years * ratePerYear)/100;
		return interest;
				
	}
	public double finalAmount() {
		finalAmount = deposit + interest;
		return finalAmount;
		
	}
}
