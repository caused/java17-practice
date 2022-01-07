package io.caused;

public class PatternMatching {

	public void getPriceDescription() {
		Object o = PaymentType.DEBIT;
		
		if(o instanceof PaymentType type) {
			System.out.println(type.getDescription());
		}
	}
}
