package io.caused;

public class SwitchExpressions {

	public double getPrice(PaymentType type, Double price) {
		var discount = switch(type) {
			case DEBIT ->  0.1;
			case CREDIT -> 0.0;
			case PIX -> {
				System.out.println("half price");
				yield 0.5;
			}
			default -> throw new RuntimeException("Invalid Type");
		};
		
		return price - (price * discount);
	}
}
