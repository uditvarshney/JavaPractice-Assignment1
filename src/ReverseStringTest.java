import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString=null;
    @Before
    public void setUp() throws Exception {
        reverseString= new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        reverseString= null;
    }

    @Test
    public void t1(){
        String expected="nodnol";
        ReverseString runTest=new ReverseString();
        String result=runTest.Test("london");

        assertEquals(expected,result);
    }
}