//Write a program in Java to resolve the diamond problem using OOPs’ concept
package assignment;

interface First {
	default void show() {
		System.out.println("Default First");
	}
}

interface Second {
	default void show() {
		System.out.println("Default Second");
	}
}

public class DiamondOOPs implements First, Second {
	public void show() {
		First.super.show();
		Second.super.show();
	}

	public static void main(String args[]) {
		DiamondOOPs ob = new DiamondOOPs();
		ob.show();
	}
}
