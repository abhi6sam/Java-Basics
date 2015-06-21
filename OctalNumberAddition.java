 /* Program to perform addition of two octal numbers
    for example ->  Octal Addition   : 456 + 123 = 601
	                Decimal Addition : 302 + 83  = 385 */
					
 class OctalNumberAddition {
    public static void main(String args[]){
		
		String input1 = "456";           // Octal String variables
		String input2 = "123";
		
		// Converting the Octal Numbers into Decimal values
		int value1 = Integer.parseInt(input1, 8);
        int value2 = Integer.parseInt(input2, 8);

        int sum = value1 + value2; 
		System.out.println(" The Decimal form of addition of " +value1+ " + " +value2+ " = " +sum);
		
		//Converting Decimal into Octal Number
		String octal = Integer.toOctalString(sum);
		System.out.println(" The Octal form of addition of " +input1+ " + " +input2+ " = " +octal);
	
    }
}