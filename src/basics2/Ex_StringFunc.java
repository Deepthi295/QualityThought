package basics2;

public class Ex_StringFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaSeleniuama";
		int size = str.length(); // to find the length of the string
		System.out.println("size:" + size);  //14
		System.out.println(str.length());
		char c = str.charAt(4); // //S to find the character which is in the 4th index
		System.out.println(c);
		System.out.println(str.charAt(8));
		System.out.println("**************************");

		int index = str.indexOf('l');
		System.out.println("index"+index);
		System.out.println(str.indexOf('l')); // to find the index value of the given letter
		System.out.println(str.lastIndexOf('a')); // to find last index value of the given letter
		System.out.println(str.indexOf('a', 3)); // to find the

		System.out.println("*****************************");
		for (int i = str.length()-1; i >= 0; i--) { // it will reverse the string which we gave
			System.out.print(str.charAt(i));

		}
		System.out.println("****************");
		System.out.println();
		boolean r = str.contains("java");// it will print if the given word is in the string 
											// or not if it has it will print t and it is a case senstive 
											// if the string has any upper case
		System.out.println(r);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");

		r = str.equals("Javaselenium");
		System.out.println(r);
		System.out.println(str.equalsIgnoreCase("JavaseleNIum"));// IT WILL PRINT BOOLEAN value and 
																	// ignore the given sentence has uppper r lower caseand
																	// check the given string is same 
		                                                            //as given string
        System.out.println("************************");
		String str1 = "";
		System.out.println(str.isEmpty()); // f //it will dispaly the boolean value if the given string is empty which
											// means no space bw the "" and no charaters
		System.out.println(str1.isEmpty()); // t
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		String str2 = "  ";
		System.out.println(str.isBlank()); // f it will display the boolean value if the given string have the space in
											// bw the " " and no charaters
		System.out.println(str2.isBlank()); // t

		System.out.println("##########################");
		String str3 = "Ramesh";
		System.out.println(str3.toUpperCase()); // it will dispay the given string in the upper case
		System.out.println(str3);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		String str4 = "JAVASELENIUmclasses"; // it will dispaly the given string in the lower case
		System.out.println(str4.toLowerCase());
		System.out.println(str4);

		System.out.println("*****************************************");
		String str5 = "QualityThought            "; // it will cut the space which is in the string we gave
		System.out.println(str5.trim());
		System.out.println(str5);
	}

}
