package question2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aoblah on 5/11/17.
 */
public class PalindromeTest {
    @Test
    public void palindromeCheck() throws Exception {
        String inputString = "ABBA";
        assertEquals(true, Palindrome.palindromeCheck(inputString));
    }

    @Test
    public void palindromeCheckFalse() throws Exception {
        String inputString = "Abba";
        assertEquals(false, Palindrome.palindromeCheck(inputString));
    }

}