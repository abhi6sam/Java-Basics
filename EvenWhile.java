/* Program to print even number between 0 to 100 using while loop */

class EvenWhile {
    public static void main(String[] args) {
	   int number = 1;
	   System.out.println("The Even number between 0 to 100 are : ");
	   
		while(number < 100) {
		    if(number % 2 == 0) 
			    System.out.println(number);
				number++;	
		}
	}
}
		