package interest;

public class SimpleInterest {
	public float CalculateSimpleInterest(float Principal,float Time,float RateOfInterest )
	{
		float Interest=(Principal*Time*RateOfInterest)/100;
		return Interest;
	}

}
