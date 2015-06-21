/* Program to print Fibonacci series using for loop */

class FibonacciNumber {
    public static void main(String [] args) {
	    int range = 10, first=0, second=1, next;
		
		System.out.println("The Fibonacci Series are : ");
        
		for (int i = 0 ; i < range ; i++ ) {
                if ( i <= 1 )
                    next = i;
                else {
                    next = first + second;
                    first = second;
                    second = next;
                }
		    System.out.println(next);
		}
		
	}
}
		