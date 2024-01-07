package in.sg.beans;

public class PaymentProcessor {

	private IPayment payment;

	public PaymentProcessor() {
		System.out.println("PaymentProcessor::0-arg  Constructor");
	}

	public PaymentProcessor(IPayment payment) {
		this.payment = payment;
		System.out.println("PaymentProcessor::param  Constructor");
	}

	public void setPayment(IPayment payment) {
		this.payment = payment;
		System.out.println("setPayment() called :: " + this.payment.getClass().getName());

	}

	public void processPayment(double amt) {
		boolean status = payment.pay(amt);

		if (status) {
			System.out.println("Thankyou ...");

		} else {
			System.out.println("Payment failed ...");
		}
	}

}
