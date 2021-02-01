package controlFlowProject;

public class AsciiChars 
{
  public static void printNumbers(){
    // TODO: print valid numeric input
	// numbers range between 48 - 57
	  for(int i = 48; i < 58; i++) {
		  System.out.printf("%c\t", i);
	  }
	  System.out.println("\n");
  }

  public static void printLowerCase(){
    // TODO: print valid lowercase alphabetic input
	  // lowercase alpha range between 97 - 122
	for(int j = 97; j < 123; j++) {
		System.out.printf("%c\t", j);
	}
	 System.out.println("\n");
  
  }

  public static void printUpperCase()
  {
    // TODO: print valid uppercase alphabetic input
	// uppercase alpha range between 65 - 98
	for(int k = 65; k < 91; k++) {
		System.out.printf("%c\t", k);
	}
	System.out.println("\n"); 
  }

  
  
  
  
//public static void printLowerCaseLetters() {
//	// TODO Auto-generated method stub
//	// lowercase alpha range between 97 - 122
//	for(int j = 97; j < 123; j++) {
//		System.out.printf("%c\t", j);
//	}
//	 System.out.println("\n");
//}
//
//
//public static void printUpperCaseLetters() {
//	// TODO Auto-generated method stub
//	// uppercase alpha range between 65 - 98
//	for(int k = 65; k < 91; k++) {
//		System.out.printf("%c\t", k);
//	}
//	System.out.println("\n");
//}


}
