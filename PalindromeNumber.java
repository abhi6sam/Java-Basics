/* Program to find if a number is palindrome or not */

class PalindromeNumber {
    public static void main(String [] args) {
	    int number,reverse = 0,remainder;
		
		number = 12213;
		
		int original = number;
		while ( number > 0) {
		    remainder = number % 10;
		    reverse = reverse * 10 + remainder;
		    number = number / 10;
			System.out.println("reverse = "+reverse);
		}
		
		if( reverse == original ) 
		    System.out.println(+original+ " is a Palindrome number");
		
		else 
		    System.out.println(+original+ " is not a Palindrome number");
		
	}
}	