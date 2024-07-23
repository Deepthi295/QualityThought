package oopsConcepts;

public class Example_ClassZzMr extends Example_ClasszMo {

	public static void main(String[] args) {  // Method Over riding 
		// TODO Auto-generated method stub
		Example_ClassZzMr e1 = new Example_ClassZzMr();
		System.out.println(e1.add(700, 300));
		
	}
	// If child class method  having the same method signature same 
	//no of arguments as of parent class so that the child class over 
	//rides the parent class called as method over riding .  

	public int add(int x, int y) {  System.out.println("Child class Method");

		return x + y;

	}

}
