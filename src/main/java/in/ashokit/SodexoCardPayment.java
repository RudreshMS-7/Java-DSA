package in.ashokit;

public class SodexoCardPayment implements Ipayment
{

	public boolean pay(double amt) {
		System.out.println("Sodexo Card Payment....");
		return true;
	}

}
