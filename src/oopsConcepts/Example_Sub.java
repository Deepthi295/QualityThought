package oopsConcepts;

public class Example_Sub extends Example_Super{

	public static void main(String[] args) {  // child class 
		// TODO Auto-generated method stub
       Example_Sub a1 = new Example_Sub();
       a1.test();
       a1.display();
       a1.show();
       System.out.println(a1.x);
       System.out.println(a1.str);
       
	}
	public void test() {
		System.out.println("test method of sub class");
	}

}
