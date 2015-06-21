/* Program to print prime number between 100 to 200 using for loop */

class PrimeForLoop2 { 
    public static void main(String[] args) {
        System.out.println("The Prime numbers between 100 to 200 are : ");
		for(int i = 100 ; i < 200; i++) {
		    int flag = 0;
			for(int j=2;j<i;j++) {
		        if(i % j == 0) {
		           flag = 1;
			       break;
			    }
			}
			if (flag==0)
		       System.out.println(i);
		} 
		
	}
}		 