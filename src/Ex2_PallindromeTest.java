import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2_PallindromeTest {

    Ex2_Pallindrome ex2_pallindrome=null;
    @Before
    public void setUp() throws Exception {
        ex2_pallindrome=  new Ex2_Pallindrome();
    }

    @After
    public void tearDown() throws Exception {
        ex2_pallindrome=null;
    }

    @Test
    public void t(){
        String expected="2468642 is palindrome and the sum of even numbers is greater than 25";

        Ex2_Pallindrome runTest=new Ex2_Pallindrome();
        String result = runTest.Test("2468642");
        assertEquals(expected,result);
    }

    @Test
    public void t2(){
        String expected="12345 is not a palindorme";

        Ex2_Pallindrome runTest=new Ex2_Pallindrome();
        String result = runTest.Test("12345");
        assertEquals(expected,result);
    }

    @Test
    public void t3(){
        String expected="12345654321 is palindrome and sum of even numbers is less than 25";

        Ex2_Pallindrome runTest=new Ex2_Pallindrome();
        String result = runTest.Test("12345654321");
        assertEquals(expected,result);
    }


}