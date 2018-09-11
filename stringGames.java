public class StringGames {

   public static void main(String[] args) {
       System.out.println(stage1("OOXXXOOOXOXOXOOOXXOXXOXOOXOXO"));
       System.out.println(stage2("OOXXXOOOXOXOXOOOXXOXXOXOOXOXO"));
       System.out.println(stage2("XXXXXOOOOOOOO"));// X->4, -7
	   System.out.println(stage3("OX"));
	   System.out.println(stage3("XOX"));
       
   }// end main

   public static int stage1(String s) {
       int returnVal = 0;
       for (int x = 1; x < s.length() - 1; x++) {
           String letters = s.substring(x, x + 2);
           if (letters.compareTo("OX") == 0) {
               returnVal++;
           } else if (letters.compareTo("XO") == 0) {
               returnVal--;
           }
       }
       return returnVal;
   } //end stage1

   public static int stage2(String s) {
       int returnVal = 0;
       for (int x = 0; x < s.length()-1; x++) {
           String letters = s.substring(x, x + 2);
           if (letters.compareTo("OO") == 0) {
               returnVal--;
           }
           else if (letters.compareTo("XX") == 0) {
               returnVal++;
           }
       }
       return returnVal;
   } //end stage2


   public static int stage3(String s) {
	   int returnValue = 0;
	   int streak = 0;
	   String prevLetter = null;
	   
	   for (int x = 0; x < s.length(); x++) {
		   String letter = s.substring(x, x + 1);
		   if (letter.compareTo("X") == 0 && x > 0) {
			   if (prevLetter.compareTo(letter) != 0) {
				   streak++;
				   returnValue += streak;
			   }
			   else {
				   streak = 0;
			   }
			   
		   }
		   if (letter.compareTo("O") == 0 && x > 0) {
			   if (prevLetter.compareTo(letter) != 0) {
				   streak++;
				   returnValue += -1 * streak;
			   }
			   else {
				   streak = 0;
			   }
		   }
		   prevLetter = letter;			   		   
	   }
	   return returnValue;
   } //end stage3
} //end class

