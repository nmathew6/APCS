
public class Digits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Digits numbers = new Digits();
		int numb = Digits.hundredsDigit(12345);
		System.out.println(numb);

	}
	public static int onesDigit(int num) {
		return num % 10;
	}
	
	public static int tensOnesDigit(int num) {
		return num % 100;
	}
	
	public static int tensDigit(int num) {
		return (num % 10) / 10;
	}
	
	public static int hundredsDigit(int num) {
		return (num % 1000) / 100;
	}
	
	public static int thousandsDigit(int num) {
		return (num % 10000) / 1000;
	}
	
	public static int getDigits(int num, int biggestDigit, int smallestDigit) {
		biggestDigit++;
		num = (int) (num %  Math.pow(10, biggestDigit));
		num = (int) (num / Math.pow(10, smallestDigit));
		return num;
	}
}
	


