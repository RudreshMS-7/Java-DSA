package in.ashokit;

public class DebitCardPayment implements Ipayment
{

	public boolean pay(double amt) {
		System.out.println("DebitCard Payment...");
		return true;
	}

}
