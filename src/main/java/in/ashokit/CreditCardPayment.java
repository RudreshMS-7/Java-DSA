package in.ashokit;

public class CreditCardPayment implements Ipayment{

	public boolean pay(double amt) {
		System.out.println("CreditCard Payment .....");
		return true;
	}

}
