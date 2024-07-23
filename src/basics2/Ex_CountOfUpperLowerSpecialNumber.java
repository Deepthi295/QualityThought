package basics2;

public class Ex_CountOfUpperLowerSpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String s = "ThiSiSJavaSelEnium@#$Progr@m@tQualityt123ThoughT";
		int upperCount = 0;
		int lowerCount = 0;
		int numericsCount = 0;
		int specialCount = 0;
		for (int i = 0;  i <s.length();i++) {
		
		 char c = s.charAt(i);
		 if (Character.isUpperCase(c)) {
			     upperCount = upperCount+1;
			    }else if (Character.isLowerCase(c)) {
			    	lowerCount = lowerCount+1;
			    	
			    }else if (Character.isDigit(c)) {
			    	numericsCount= numericsCount+1;
			    	
			    }else {
			    	specialCount = specialCount+1;
			}
			  }
		System.out.println("UpperCase Count"+upperCount);
		System.out.println("lowercase count "+lowerCount);
		System.out.println("Numerics count "+numericsCount);
		System.out.println("Special count"+specialCount);
		}

}
