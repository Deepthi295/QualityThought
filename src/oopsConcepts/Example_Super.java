package oopsConcepts;

public class Example_Super {  // parent Class
	public int x = 100;
	public String str = "javaselenium";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Super e1 = new Example_Super();
		e1.display();
		e1.show();
		System.out.println(e1.x);
		System.out.println(e1.str);

	}

	public void display() {
		System.out.println("Display method of super class");

	}

	public void show() {
		System.out.println("show the method of super class");

	}

}
