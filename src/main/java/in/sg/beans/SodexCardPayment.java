package in.sg.beans;

public class SodexCardPayment implements IPayment {

	public SodexCardPayment() {
		System.out.println("SodexCardPayment :: Constructor");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("Sodexo Payment in progress ...");
		return true;
	}

}
