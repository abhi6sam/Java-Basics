/* Program to print even numbers between 1000 to 1020  using for loop */

class EvenForLoop {
    public static void main(String[] args) {
        System.out.println("The Even number between 1000 to 1020 are : ");
		
        for(int number = 1000;number<=1020;number++) {
		    if(number % 2 == 0)
		    System.out.println(number);
		}
	}
}		 