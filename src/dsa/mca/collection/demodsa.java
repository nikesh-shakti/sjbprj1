package dsa.mca.collection;

import java.util.ArrayList;
public class demodsa {

	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(3);
		System.out.println(n);
		System.out.println(n.get(2));
		n.addFirst(5);
		System.out.println(n);
		n.add(2, 15);
		System.out.println(n);

	}

}
