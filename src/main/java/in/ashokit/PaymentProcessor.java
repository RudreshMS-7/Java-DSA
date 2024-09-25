package in.ashokit;

public class PaymentProcessor {
	
	private Ipayment payment;
	
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}



	public  void  Processpayment(double amt) {
		boolean status = payment.pay(amt);
		
		if(status) {
			System.out.println("Payment success Thank you...");
		}else
		{
			System.out.println("payment failed.....");
		}
	}

}
