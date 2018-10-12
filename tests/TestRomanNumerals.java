import static org.junit.Assert.*;
import org.junit.Test;

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

public class TestRomanNumerals {


	@Test
	public void test_roman_convertSingleLetters() {
		// Arrange
		int returnedArabicI; 
		int returnedArabicV;
		int returnedArabicX;
		int returnedArabicL;
		int returnedArabicC;
		int returnedArabicD; 
		
		// Act
		returnedArabicI = RomanNumerals.convertToInteger("I");
		returnedArabicV = RomanNumerals.convertToInteger("V");
		returnedArabicX = RomanNumerals.convertToInteger("X");
		returnedArabicL = RomanNumerals.convertToInteger("L");
		returnedArabicC = RomanNumerals.convertToInteger("C");
		returnedArabicD = RomanNumerals.convertToInteger("D");
		
		// Assert
		assertEquals(1, returnedArabicI);
		assertEquals(5, returnedArabicV);
		assertEquals(10, returnedArabicX);
		assertEquals(50, returnedArabicL);
		assertEquals(100, returnedArabicC);
		assertEquals(500, returnedArabicD);
	}
	
	@Test
	public void test_roman_convertDoubleLetters() {
		// Arrange
		int returnedArabicII; 
		int returnedArabicIV;
		int returnedArabicVI;
		int returnedArabicIX;
		int returnedArabicXI;
		int returnedArabicXV;
		int returnedArabicXX;
		int returnedArabicXL;
		int returnedArabicLX;
		int returnedArabicXC;
		int returnedArabicCX;
		int returnedArabicCC;
		int returnedArabicCD;
		int returnedArabicDC;
		int returnedArabicCM;
		int returnedArabicMC;
		
		// Act
		returnedArabicII = RomanNumerals.convertToInteger("II");
		returnedArabicIV = RomanNumerals.convertToInteger("IV");
		returnedArabicVI = RomanNumerals.convertToInteger("VI");
		returnedArabicIX = RomanNumerals.convertToInteger("IX");
		returnedArabicXI = RomanNumerals.convertToInteger("XI");
		returnedArabicXV = RomanNumerals.convertToInteger("XV");
		returnedArabicXX = RomanNumerals.convertToInteger("XX");
		returnedArabicXL = RomanNumerals.convertToInteger("XL");
		returnedArabicLX = RomanNumerals.convertToInteger("LX");
		returnedArabicXC = RomanNumerals.convertToInteger("XC");
		returnedArabicCX = RomanNumerals.convertToInteger("CX");
		returnedArabicCC = RomanNumerals.convertToInteger("CC");
		returnedArabicCD = RomanNumerals.convertToInteger("CD");
		returnedArabicDC = RomanNumerals.convertToInteger("DC");
		returnedArabicCM = RomanNumerals.convertToInteger("CM");
		returnedArabicMC = RomanNumerals.convertToInteger("MC");
		
		// Assert
		assertEquals(2, returnedArabicII);
		assertEquals(4, returnedArabicIV);
		assertEquals(6, returnedArabicVI);
		assertEquals(9, returnedArabicIX);
		assertEquals(11, returnedArabicXI);
		assertEquals(15, returnedArabicXV);
		assertEquals(20, returnedArabicXX);
		assertEquals(40, returnedArabicXL);
		assertEquals(60, returnedArabicLX);
		assertEquals(90, returnedArabicXC);
		assertEquals(110, returnedArabicCX);
		assertEquals(200, returnedArabicCC);
		assertEquals(400, returnedArabicCD);
		assertEquals(600, returnedArabicDC);
		assertEquals(900, returnedArabicCM);
		assertEquals(1100, returnedArabicMC);
	}

	@Test
	public void test_roman_convertComplexLetters() {
		/*
		1984	=	MCMLXXXIV
		2014	=	MMXIV
		 */		

		// Arrange
		int returnedArabicMCMLXXXIV; 
		int returnedArabicMMXIV;
		
		// Act
		returnedArabicMCMLXXXIV = RomanNumerals.convertToInteger("MCMLXXXIV");
		returnedArabicMMXIV = RomanNumerals.convertToInteger("MMXIV");
		
		// Assert
		assertEquals(1984, returnedArabicMCMLXXXIV);
		assertEquals(2014, returnedArabicMMXIV);
	}
	
	
}
