package exceptions;

public class Example_Finial {
	static final int x = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Finial e1 = new Example_Finial();

		// e1. x= 90;//final variable cannot be change
	}

	public final void test1() {
		System.out.println("test1 method");
	} // if we make a method as final we cannot over ride it
}