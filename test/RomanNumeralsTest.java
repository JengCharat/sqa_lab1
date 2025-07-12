import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    void testSingleDigit() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals(1, roman.convertRomanNumToInt("I"));
        assertEquals(5, roman.convertRomanNumToInt("V"));
        assertEquals(10, roman.convertRomanNumToInt("X"));
        assertEquals(50, roman.convertRomanNumToInt("L"));
        assertEquals(100, roman.convertRomanNumToInt("C"));
        assertEquals(500, roman.convertRomanNumToInt("D"));
        assertEquals(1000, roman.convertRomanNumToInt("M"));
    }
    @Test
    void testFirstSmaller(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals(4,roman.convertRomanNumToInt("IV"));
        assertEquals(9,roman.convertRomanNumToInt("IX"));
        assertEquals(40,roman.convertRomanNumToInt("XL"));
        assertEquals(90,roman.convertRomanNumToInt("XC"));
        assertEquals(400,roman.convertRomanNumToInt("CD"));
        assertEquals(900,roman.convertRomanNumToInt("CM"));
    }
    @Test
    void testFirstLarger(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals(6,roman.convertRomanNumToInt("VI"));
        assertEquals(11,roman.convertRomanNumToInt("XI"));
        assertEquals(60,roman.convertRomanNumToInt("LX"));
        assertEquals(150,roman.convertRomanNumToInt("CL"));
        assertEquals(600,roman.convertRomanNumToInt("DC"));
        assertEquals(1100,roman.convertRomanNumToInt("MC"));
    }
    @Test
    void tetTwoSameNumber(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals(2, roman.convertRomanNumToInt("II"));
        assertEquals(20, roman.convertRomanNumToInt("XX"));
        assertEquals(200, roman.convertRomanNumToInt("CC"));
        assertEquals(2000, roman.convertRomanNumToInt("MM"));
    }
    @Test 
    void tetThreeSameNumber(){
        RomanNumerals roman = new RomanNumerals();
        assertEquals(3, roman.convertRomanNumToInt("III"));
        assertEquals(15, roman.convertRomanNumToInt("VVV"));
        assertEquals(150, roman.convertRomanNumToInt("LLL"));
        assertEquals(1500, roman.convertRomanNumToInt("DDD"));
        assertEquals(3000, roman.convertRomanNumToInt("MMM"));
    }
    @Test
    void testMultipleDigitsFirstLarger() {
        RomanNumerals roman = new RomanNumerals();

        assertEquals(26, roman.convertRomanNumToInt("XXVI"));
        assertEquals(27, roman.convertRomanNumToInt("XXVII"));
        assertEquals(67, roman.convertRomanNumToInt("LXVII"));
        assertEquals(1207, roman.convertRomanNumToInt("MCCVII"));
        assertEquals(160, roman.convertRomanNumToInt("CLX"));
        assertEquals(666, roman.convertRomanNumToInt("DCLXVI"));
    }
    @Test
    void testMixedPatternCases() {
        RomanNumerals roman = new RomanNumerals();
        assertEquals(74, roman.convertRomanNumToInt("LXXIV"));     
        assertEquals(76, roman.convertRomanNumToInt("LXXVI"));     
        assertEquals(78, roman.convertRomanNumToInt("LXXVIII"));   
        assertEquals(84, roman.convertRomanNumToInt("LXXXIV"));    
    }

    /*/////////////////////////negative case////////////////////////////*/

         
    @Test
    void testInvalidCharacters() {
        RomanNumerals roman = new RomanNumerals();
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("J"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("K"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("ZXC"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("123"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("!@#"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("IVXK"));
    }
    @Test
    void testInvalidRepetition() {
        RomanNumerals roman = new RomanNumerals();
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("VV"));
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("LL"));
        assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("DD"));
    }
     @Test
        void testMoreThanThreeRepetitions() {
            RomanNumerals roman = new RomanNumerals();
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("IIII"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("XXXX"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("CCCC"));
            assertThrows(IllegalArgumentException.class, () -> roman.convertRomanNumToInt("MMMM"));
        }
}
