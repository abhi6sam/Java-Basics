/* Program to print odd numbers between 500 to 600 using for Loop */

class OddForLoop { 
    public static void main(String[] args) {
        System.out.println("The Odd number between 500 to 600 are : ");

        for(int number = 500; number <= 600; number++) {
		    if(number % 2 != 0)
		    System.out.println(number);
		}
	}
}		 