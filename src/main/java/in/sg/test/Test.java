package in.sg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sg.beans.PaymentProcessor;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans-autowire.xml");

		PaymentProcessor pp = ctxt.getBean(PaymentProcessor.class);
		//PaymentProcessor pp1 = ctxt.getBean(PaymentProcessor.class);
		System.out.println(pp.hashCode());
		//System.out.println(pp1.hashCode());
		pp.processPayment(1200.50);

	}

}
