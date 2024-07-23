package practice;

public class Ex_StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is deepthi";
		int p = str.length();
		System.out.println(p);
		System.out.println(str.length());
		System.out.println(str.indexOf('s'));
		System.out.println(str.lastIndexOf('h'));
		System.out.println(str.charAt(6));
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		boolean r = str.contains("deepthi");
		System.out.println(r);
		System.out.println(str.equalsIgnoreCase("ThIs Is DeePtHI"));
		System.out.print("&&&&&&&&&&&&&&&&&&&&&&&&&");

		String s = " ";
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());

	}

}
