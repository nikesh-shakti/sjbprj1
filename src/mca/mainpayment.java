package mca;

public class mainpayment extends payment{

	@Override
	void pay() {

		System.out.println("cash payment");
	}
	public static void main(String[]args) {
		mainpayment p=new mainpayment();
		p.pay();
		p.printbill();
	}
}

