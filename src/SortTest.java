import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    Sort sort= null;
    @Before
    public void setUp() throws Exception {
        sort=new Sort();
    }

    @After
    public void tearDown() throws Exception {
        sort=null;
    }

    @Test
    public void t1(){
        String expected[]={"544332","10","False"};
        Sort runTest=new Sort();
        String result[]=new String[3];
        result= runTest.Test("234534");
        assertArrayEquals(expected,result);
    }
}