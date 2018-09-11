import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class N_times_StringTest {

    N_times_String n_times_string=null;
    @Before
    public void setUp() throws Exception {
        n_times_string= new N_times_String();
    }

    @After
    public void tearDown() throws Exception {
        n_times_string=null;
    }

    @Test
    public void t1(){
        String expected="Stackrouterouterouterouterouteroute";
        N_times_String runTest= new N_times_String();
        String result=runTest.Test("Stackroute",5);
        assertEquals(expected,result);
    }

    @Test
    public void t2(){
        String expected="Stackroutetete";
        N_times_String runTest= new N_times_String();
        String result=runTest.Test("Stackroute",2);
        assertEquals(expected,result);
    }
}