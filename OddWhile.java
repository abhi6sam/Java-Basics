/* Program to print odd number between 100 to 200 using while loop */

class OddWhile {
    public static void main(String[] args) {
	    int number = 100;
		System.out.println("The Odd number between 100 to 200 are : ");
		
		while(number < 200) {
		    if(number % 2 != 0) 
			    System.out.println(number);
				number++;
		}
	}
}
		