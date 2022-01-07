package io.caused;

public enum PaymentType {
	
	DEBIT("pagamento à vista"), 
	CREDIT("será pago na fatura do cartão"), 
	PIX("transferência instantânea");
	
	private String description;
	
	PaymentType(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}

}
