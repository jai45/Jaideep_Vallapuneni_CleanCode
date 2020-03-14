package clientapp;
import houseconstruction.*;
public class ClientClass {

	public static void main(String args[])
	{
		HouseConstruction houseobject = new HouseConstruction();
		double cost =houseobject.Costforconstruction("standard", 2500,false);
		System.out.println("Cost of the house is :"+cost);
	}
	
}
