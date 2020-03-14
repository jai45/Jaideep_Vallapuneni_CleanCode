package interest;

public class CompoundInterest {

	public double CalculateCompoundInterest(double Principal,double InterestRate,double TimePeriod)
	{
		double CompoundInterest=Principal*Math.pow((1+InterestRate/100),TimePeriod);
		return CompoundInterest;
	}
}
