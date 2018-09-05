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
       
       System.out.println(a.capFirstWord("hi. my name is nathan. good to see you."));
       System.out.println(a.capFirstWord("17 sheep are roaming on the pastures. and there is nathan with them"));
       


   } // end main

   public static int SpaceCount(String s) { // returns number of spaces in a string
       int returnValue = 0;
       for (int x = 0; x < s.length(); x++) {
           if (s.substring(x, x + 1).compareTo(" ") == 0) {
               returnValue ++;
           }
       }
       return returnValue;
   } //end SpaceCount


   public static int vowelCount(String s) { //returns number of vowels in a string
       int returnValue = 0;
       for (int x = 0; x < s.length(); x++) {
           String letter = s.substring(x, x + 1);
           if (letter.compareTo("a") == 0 ||letter.compareTo("e") == 0||letter.compareTo("i") == 0||letter.compareTo("o") == 0||letter.compareTo("u") == 0) {
               returnValue ++;
           }
       }
       return returnValue;

   } //end vowelCount

   public static int letterCount(String s, String let) { //returns number of inputted char in a string
       int returnValue = 0;
       for (int x = 0; x < s.length() - 1; x++) {
           String letter = s.substring(x, x + 1);
           if (letter.compareTo(let) == 0) {
               returnValue ++;

           }
       }
       return returnValue;

   } //end letterCount




   public static String beforeString(String s, String substr) { //Given a string s, return the portion of the string that comes before substr.
       int indexSub = s.indexOf(substr);
       if (indexSub == -1) {
           return s;
       }
       else {
           return s.substring(0, indexSub);
       }
   }// end beforeSting


   public static String afterString(String s, String substr) { // Given a string s, return the portion of the string that comes after substr.
       int indexSub = s.indexOf(substr);
       if (indexSub == -1) { //checks if subStr in s
           return s;
       }
       else {
           return s.substring(indexSub + substr.length()); //returns everything after subStr
       }
   } //end afterString

   public static String capVowel(String s) { // capatalizes every vowel in a string
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

   }// end capVowel

   public static String capFirstWord(String s) { // Capitalizes first letter of each sentence in string
       String returnValue = "";
       String alpha = "abcdefghijklmnopqrstuvwxyz";
       Boolean capNext = true;
       for (int x = 0; x < s.length(); x++) {
           String letter = s.substring(x, x + 1);
           if (capNext == true && alpha.indexOf(letter)!= -1) {
               returnValue += letter.toUpperCase();
               capNext = false;
           }
           else if (capNext == true && alpha.indexOf(letter) == -1) {
               returnValue += letter;
           }
           else if (capNext == false && letter.compareTo(".") == 0) {
               returnValue += letter;
               capNext = true;
           }
           else { //adds to return Value
               returnValue += letter;
           }
       }
       return returnValue;


   } // end capFirstWord

}// end class






