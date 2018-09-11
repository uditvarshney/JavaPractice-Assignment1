import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    Add add=null;
    @Before
    public void setUp() throws Exception {
        add=new Add();
    }

    @After
    public void tearDown() throws Exception {
        add=null;
    }
    @Test
    public void t(){
        String expected="41";

        Add runTest=new Add();
        String result = runTest.Test("12 23 2 4");
        assertEquals(expected,result);
    }

    @Test
    public void t2(){
        String expected="Error: input is not a integer";
        Add runTest=new Add();
        String result = runTest.Test("12 13.8 12");
        assertEquals(expected,result);
    }

    @Test
    public void t3(){
        String expected="207";
        Add runTest=new Add();
        String result = runTest.Test("123 -5 21 11 0 45 12");
        assertEquals(expected,result);
    }

    @Test
    public void t4(){
        String expected="Error: input is not a integer";
        Add runTest=new Add();
        String result = runTest.Test("10 x 4 9");
        assertEquals(expected,result);
    }
}