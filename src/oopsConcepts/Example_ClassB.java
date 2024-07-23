package oopsConcepts;

public class Example_ClassB extends Example_ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_ClassB b1 = new Example_ClassB();
		b1.test2();
		b1.test1();
		System.out.println(b1.a);

	}

	public void test2() {
		System.out.println("test2 method of class B");

	}
}
