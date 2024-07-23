package access1;

public class Example_Access11 {

	private int pr = 100;   
	int de = 200;
	protected String pro = "java selenium";
	public long f = 998989;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_Access11 a1 = new Example_Access11();
		a1.display_private();
		System.out.println(a1.pr);
		a1.display_default();
		System.out.println(a1.de);
		a1.display_protected();
		System.out.println(a1.pro);
		a1.dsiplay_public();
		System.out.println(a1.f);
	}

	private void display_private() {
		System.out.println("this is a private method ");
		// A variable which is declared as private class is 
		//only used with the same class not in the child class 
		}
	void display_default() {
		System.out.println("this is a default method");
	}
	protected void display_protected() {
	System.out.println("this is a protected method");
	
	}
	public void dsiplay_public() {
		System.out.println("This is a public method ");
		}
}
