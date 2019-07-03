package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class transposeStringTest {
     TransposeString object;
    @Before
    public void setUp() throws Exception {
        object=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void transposeOfString() {
        String result=object.reverseWord("i am prathyusha");
        assertEquals("i ma ahsuyhtarp",result);
    }
    @Test
    public void transposeOfStringWithCapitalLetters() {
        String result=object.reverseWord("HELLO WORLD");
        assertEquals("OLLEH DLROW",result);
    }
    @Test
    public void GivenNumberStringWillReturnTransposeNumberString() {
        String result=object.reverseWord("13 08 03");
        assertEquals("31 80 30",result);
    }
}