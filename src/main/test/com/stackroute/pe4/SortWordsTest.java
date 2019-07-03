package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.SortWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords object;
    @Before
    public void setUp() throws Exception {
        object=new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void sortWordsOfString() {
        List<String> actualResult = object.sortWordsOfString("prathyusha meghana");
        List<String> expectedResult = Arrays.asList("meghana", "prathyusha");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void givenIntegerStringsReturnsSortedIntegerStrings() {
        List<String> actualResult = object.sortWordsOfString("23 0 45 73");
        List<String> expectedResult = Arrays.asList("0", "23", "45", "73");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullReturnNullString() {
        List<String> actualResult = object.sortWordsOfString("");
        List<String> expectedResult = Arrays.asList("");
        assertEquals(expectedResult, actualResult);
    }
}