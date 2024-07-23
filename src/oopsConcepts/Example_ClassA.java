package oopsConcepts;

public class Example_ClassA {

	public int a = 100;

	public static void main(String[] args) {

		Example_ClassA e1 = new Example_ClassA();
		e1.test1();
		System.out.println(e1.a);

	}

	public void test1() {
		System.out.println("Test1 method of class A");

	}
}
