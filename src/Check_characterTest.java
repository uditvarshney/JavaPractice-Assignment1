import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Check_characterTest {

    Check_character check_character=null;
    @Before
    public void setUp() throws Exception {
        check_character= new Check_character();
    }

    @After
    public void tearDown() throws Exception {
        check_character=null;
    }

    @Test
    public void t1(){
        String expected="Capital Letter";
        Check_character runTest=new Check_character();

        String result=runTest.Test("A");
        assertEquals(expected,result);
    }

    @Test
    public void t2(){
        String expected="Small Case Letter";
        Check_character runTest=new Check_character();

        String result=runTest.Test("d");
        assertEquals(expected,result);
    }

    @Test
    public void t3(){
        String expected="Digit";
        Check_character runTest=new Check_character();

        String result=runTest.Test("4");
        assertEquals(expected,result);
    }
    @Test
    public void t4(){
        String expected="Special Symbol";
        Check_character runTest=new Check_character();

        String result=runTest.Test("$");
        assertEquals(expected,result);
    }
}