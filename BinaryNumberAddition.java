/* Program to perform addition of two Binary Numbers 
   for example ->   Binary  Addition : 1010 + 10 = 1100  
                    Decimal Addition :  10  + 2  = 12   */
   
class BinaryNumberAddition {
    public static void main(String args[]){
		String input0 = "1010";              // Binary String variables
        String input1 = "10"; 

        // Converting the Binary Number into Decimal Number  
        int number0 = Integer.parseInt(input0, 2);
        int number1 = Integer.parseInt(input1, 2);

        int sum = number0 + number1;
		System.out.println(" The decimal form of addition of " + number0+ " + " + number1+ " = " +sum);
		
	    // Converting Decimal Number into Binary Number
		String binary = Integer.toBinaryString(sum);
		System.out.println(" The binary form of addition of " + input0 + " + " + input1 + " = " +binary);
            
    }
}
