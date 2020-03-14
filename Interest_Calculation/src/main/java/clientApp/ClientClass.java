package clientApp;
import interest.*;
public class ClientClass {
public static void main(String args[]) {
	CompoundInterest compoundinterestobject=new CompoundInterest();
	double interest =compoundinterestobject.CalculateCompoundInterest(100000,9.5,5);
	System.out.println("Compound Interest is :"+interest);
	
	SimpleInterest simpleinterestobject = new SimpleInterest();
	double simpleinterest=simpleinterestobject.CalculateSimpleInterest(2500, 15,6);
	System.out.println("Simple interest is :"+simpleinterest);
}
}
