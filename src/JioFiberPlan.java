
public class JioFiberPlan {
	
	double gstTax = 0.18; //18%
	double silverPlanCost = 699.00;
	double finalCost;

	public double calculateFinalPlanCost() {
		finalCost = silverPlanCost + (silverPlanCost * gstTax);
		return finalCost;
		// TODO Auto-generated constructor stub
	}

}
