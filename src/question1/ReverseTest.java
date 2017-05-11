package question1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aoblah on 5/11/17.
 */
public class ReverseTest {
    @Test
    public void reverseTheString() throws Exception {
        String inputString = "Hello World";
        assertEquals("dlroW olleH", Reverse.reverseTheString(inputString));
    }


    @Test
    public void reverseTheString2() throws Exception {
        String inputString = "";
        assertEquals("", Reverse.reverseTheString(inputString));
    }

}