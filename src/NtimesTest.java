import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NtimesTest {

    Ntimes ntimes=null;
    @Before
    public void setUp() throws Exception {
        ntimes=new Ntimes();
    }

    @After
    public void tearDown() throws Exception {
        ntimes=null;
    }

    @Test
    public void t1(){
        String expected="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5";
        Ntimes runTest= new Ntimes();
        String result= runTest.Test(5);
        assertEquals(expected,result);
    }

    @Test
    public void t2(){
        String expected="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6";
        Ntimes runTest= new Ntimes();
        String result= runTest.Test(6);
        assertEquals(expected,result);
    }
}