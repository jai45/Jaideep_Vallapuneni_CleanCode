package houseconstruction;

public class HouseConstruction {

	public double Costforconstruction(String standard,double areaofhouse,boolean fullyautomated)
	{
		double cost=0;
		if(standard.equalsIgnoreCase("standard"))
		{
			cost =1200*areaofhouse;
		}
		else if(standard.equalsIgnoreCase("above standard"))
		{
			cost =1500*areaofhouse;
		}
		else if(standard.equalsIgnoreCase("high standard"))
		{
			if(fullyautomated==true)
			{
				cost =2500*areaofhouse;
			}
			else
			{
				cost =1800*areaofhouse;
			}
		}
		return cost;
	}
}
