/* Program to check if number is prime or not using for loop */

class PrimeForLoop { 
    public static void main(String[] args) {
        
        int number = 7;  //replace this by any other number
		int flag = 0;
		
        for(int i = 2 ; i < number; i++) {
		    if(number % i == 0) 
		    flag = 1;	
		} 
		if (flag == 0)
		    System.out.println( +number+ " is  a prime");
		else
		    System.out.println( +number+ " is  not a prime");
	}
}		 