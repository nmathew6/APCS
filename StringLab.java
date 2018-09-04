class StringLab {
  
  public static void main(String[] args) {
	StringLab a = new StringLab();
	
	System.out.println(a.SpaceCount("hi hi "));
	
	System.out.println(a.beforeString("Hello World!","Wo"));
	System.out.println(a.beforeString("Hello World!","Nathan"));
	System.out.println(a.beforeString("HelloxWorld!","Wo"));	
	
	System.out.println(a.afterString("Hello World!","Wo"));
	System.out.println(a.afterString("Hello World!","Nathan"));
	System.out.println(a.afterString("HelloxWorld!","Wo"));
	System.out.println(a.afterString("HelloxWorld!","x"));

	System.out.println(a.capVowel("nathan hello goodbye aeiou"));
	
	
  } // end main
  
  public static int SpaceCount(String s) {
    int returnValue = 0;
    for (int x = 0; x < s.length(); x++) {
      if (s.substring(x, x + 1).equals(" ")) {
          returnValue ++;
      }
    }
    return returnValue;
} //end SpaceCount

          
  public static int vowelCount(String s) {
    int returnValue = 0;
    for (int x = 0; x < s.length(); x++) {
      String letter = s.substring(x, x + 1); 
      if (letter.equals("a") ||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("e")) {
          returnValue ++;
          }
    }
    return returnValue;
    
   } //end vowelCount

  public static int letterCount(String s, String let) {
    int returnValue = 0;
    for (int x = 0; x < s.length() - 1; x++) {
      String letter = s.substring(x, x + 1); 
      if (letter.equals(let)) {
      	returnValue ++;
               
          }
    }
    return returnValue;
    
   } //end letterCount

    

  
  public static String beforeString(String s, String substr) {
	  int indexSub = s.indexOf(substr);
	  if (indexSub == -1) {
		  return s;
	  }
	  else {
		  return s.substring(0, indexSub);
	  }
  }// end beforeSting
  
  
  public static String afterString(String s, String substr) {
	  int indexSub = s.indexOf(substr);
	  if (indexSub == -1) {
		  return s;
	  }
	  else {
		  return s.substring(indexSub + substr.length());
	  }
  } //end afterString
   	
  public static String capVowel(String s) {
	  String returnValue = "";
	  String vowels = "aeiou";
	  for (int x=0; x < s.length(); x++) {
		  String letter = s.substring(x, x + 1);
		  if (vowels.indexOf(letter) == -1) {
			  returnValue += letter;
		  }
		  else {
			  returnValue += letter.toUpperCase();
		  }
	  }
	  return returnValue;
  
  }

}// end string lab
   	
   	
 
    


