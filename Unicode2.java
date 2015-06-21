/* Program to Find the Unicode for all 26 characters in English alphabet */
// Unicode of { a = 97 and z = 122 } and { A = 65 and Z = 90}

class Unicode2 {
    public static void main(String[] args) {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
            System.out.println(" " + (int) ch);
		}
		for(char cy = 'a'; cy <= 'z'; cy++) {
            System.out.print(cy);
            System.out.println(" " + (int) cy);
		}
	}
}

/* Reverse Printing from numbers to characters
   for(int cy = 65; cy <= 90; cy++) {
		    char charValue = (char) cy;
             System.out.print(cy);
             System.out.println(" " +charValue);
			 
	for(int ch = 65; ch <= 90; ch++) {
		    char charValue = (char) ch;
             System.out.print(ch);
             System.out.println(" " +charValue); */