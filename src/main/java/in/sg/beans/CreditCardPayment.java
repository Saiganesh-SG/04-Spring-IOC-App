package in.sg.beans;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment::Constructor");

	}

	@Override
	public boolean pay(double amt) {
		// TODO Auto-generated method stub

		System.out.println("Credit Card Payment in progress...");
		return true;
	}

}
