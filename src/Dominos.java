
public class Dominos {
	double pizzaCost = 399.00;
	int noOfPizza = 2;
	double discountRate = 0.20;
	double discount;
	double billBeforeDiscount;
	double billAfterDiscount;

	public double calculateBill() {
		billBeforeDiscount = pizzaCost * noOfPizza; //798
		discount = billBeforeDiscount * discountRate; // 159.60
		billAfterDiscount = billBeforeDiscount - discount; //798-159.60 = 638.40
		return billAfterDiscount;
		
	}
}
