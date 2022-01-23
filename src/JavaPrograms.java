
public class JavaPrograms {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary salaryObj = new Salary();
		
		System.out.println("Tax on 85000 at 20% = " +salaryObj.calculateTax());
		Dominos dominosObj = new Dominos();
		
		System.out.println("Final bill after discount = "+dominosObj.calculateBill());
		
		JioFiberPlan planObj = new JioFiberPlan();
		System.out.println("Final cost for Jio Silver plan cost = " + planObj.calculateFinalPlanCost());

	}

}
