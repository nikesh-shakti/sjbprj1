package mca;

public class demointerface implements game{

	public static void main(String[] args) {
		demointerface o=new demointerface();
		o.move();
		o.f1();

	}

	@Override
	public void move() {
		System.out.println("moving left");
		
	}

}
