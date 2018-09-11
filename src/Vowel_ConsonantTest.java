import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class Vowel_ConsonantTest {

    Vowel_Consonant vowel_consonant=null;
    @Before
    public void setUp() throws Exception {
        vowel_consonant=new Vowel_Consonant();
    }

    @After
    public void tearDown() throws Exception {
        vowel_consonant=null;
    }

    @Test
    public void t1(){
        String expected= "Consonant";
        Vowel_Consonant runTest= new Vowel_Consonant();
        String result=runTest.Test("p");
        assertEquals(expected,result);
    }

    @Test
    public void t2(){
        String expected= "Vowel Consonant (should it be a - vowel, p - consonant)";
        Vowel_Consonant runTest= new Vowel_Consonant();
        String result=runTest.Test("ap");
        assertEquals(expected,result);
    }

    @Test
    public void t3(){
        String expected= "Vowel";
        Vowel_Consonant runTest= new Vowel_Consonant();
        String result=runTest.Test("i");
        assertEquals(expected,result);
    }
    @Test
    public void t4(){
        String expected= "Error: String contains digit.";
        Vowel_Consonant runTest= new Vowel_Consonant();
        String result=runTest.Test("12");
        assertEquals(expected,result);
    }
}