package mca;

public class main extends person {

	@Override
	void f1() {
		// TODO Auto-generated method stub
		super.f1();
		System.out.println("child method");
	}

	public static void main(String[] args) {
		main p=new main();
		p.f1();
	}

}
