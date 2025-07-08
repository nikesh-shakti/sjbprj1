package mca;

public interface game {
	void move();
	default void f1() {
		System.out.println("moving");
	}

}
