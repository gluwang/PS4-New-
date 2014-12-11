public class calculator {
	private double InvestmentAmount;
	private int Years;
	private double AnnualInterestRate;
	
	public calculator(){
		InvestmentAmount = 10000;
		Years = 3;
		AnnualInterestRate = 3.25;
	}
	
	public calculator(double Inverst, int year, double Rate){
		InvestmentAmount = Inverst;
		Years = year;
		AnnualInterestRate = Rate;
	}
	
	public double Future(){
		double MonthlyRate = AnnualInterestRate /100 / 12;
		int time = Years * 12;
		double future = InvestmentAmount;
		for(int i = 0; i < time; i++){
			future = future * (1 + MonthlyRate);
		}
		return future;
	}
	
	public static void main(String[] arg){
		calculator c = new calculator(10000, 3, 3.25);
		System.out.println(c.Future());
	}
}
