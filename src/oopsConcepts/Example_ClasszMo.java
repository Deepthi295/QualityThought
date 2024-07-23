package oopsConcepts;

public class Example_ClasszMo {  // method overloading 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Example_ClasszMo e1 = new Example_ClasszMo();
       int sum =e1.add (100,200);
       System.out.println(sum);
       System.out.println(e1.add(300, 400));
       System.out.println(e1.add(100, 200,300));
       //Method having the same name different method signatures 
       //with in the same class is called method over loading   
      
	}
	public int add (int x ,int y ) {
		return x+y;
		
	}
public int add(int x,int y ,int z) {
	return (x+y+z);
	
}
}
