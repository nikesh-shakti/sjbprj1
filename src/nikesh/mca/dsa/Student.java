package nikesh.mca.dsa;

public class Student {

	public static void main(String[] args) {
		product p1=new product(100,"desktop",12000);
		product p2=new product(100,"desktop",12000);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
