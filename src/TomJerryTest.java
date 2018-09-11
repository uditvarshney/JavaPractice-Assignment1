import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    TomJerry tomJerry=null;
    @Before
    public void setUp() throws Exception {
        tomJerry= new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        tomJerry=null;
    }

    @Test
    public void t1(){
        String expected="Tom";
        TomJerry runTest= new TomJerry();
        String result= runTest.Test(25);
        assertEquals(expected,result);
    }

    @Test
    public void t2(){
        String expected="Jerry";
        TomJerry runTest= new TomJerry();
        String result= runTest.Test(24);
        assertEquals(expected,result);
    }
}