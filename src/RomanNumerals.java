/*
	1 I 10 X 100 C
	2 II 20 XX 200 CC
	3 III 30 XXX 300 CCC
	4 IV 40 XL 400 CD
	5 V 50 L 500 D
	6 VI 60 LX 600 DC
	7 VII 70 LXX 700 DCC
	8 VIII 80 LXXX 800 DCCC
	9 IX 90 XC 900 CM
 */
/*
	1984	=	MCMLXXXIV
	2014	=	MMXIV
 */

public class RomanNumerals {

    private static int convertLetterToNumber(char roman) {
        switch (roman) {
           case 'I':  return 1;
           case 'V':  return 5;
           case 'X':  return 10;
           case 'L':  return 50;
           case 'C':  return 100;
           case 'D':  return 500;
           case 'M':  return 1000;
           default:   return 0;
        }
     }
    
	public static int convertToInteger(String romanNum) {
		 if (romanNum.length() == 0) {
			 return 0;
		 }
		 // Convert to upper case letters for transfer
		 romanNum = romanNum.toUpperCase(); 
          
		int arabicNumber = 0;
		int i = 0;
		while (i < romanNum.length()) {
			// Pick letters one by one
			char romanLetter = romanNum.charAt(i);
			int convertedNumber = convertLetterToNumber(romanLetter);
			i++;
			
			// Case of last letter
            if (i == romanNum.length()) {
             arabicNumber += convertedNumber;
          } else {
        	  int nextConvertedNumber = convertLetterToNumber(romanNum.charAt(i));
        	  
              if (nextConvertedNumber > convertedNumber) {
                  // Combine the 2 letters (for example IV = 4, meaning that 5-1 = 4)
            	  arabicNumber += (nextConvertedNumber - convertedNumber);
            	  i++;
             } else {
            	 // Just add the number (for example VI = 6, 5 + 1 = 6)
            	 arabicNumber += convertedNumber;
             }
              
          }
		}

		return arabicNumber;
		
	}
}
