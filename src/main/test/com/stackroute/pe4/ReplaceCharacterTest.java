package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.ReplaceCharacter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter character;
    @Before
    public void setUp() throws Exception {
        character=new ReplaceCharacter();
    }

    @After
    public void tearDown() throws Exception {
        character=null;
    }

    @Test
    public void replaceOfTheGivenCharacter() {
        String result=character.replaceOfTheGivenCharacter("daily dry");
        assertEquals("faity fry",result);
    }
    @Test
    public void givenNumberStringReturnsTheSameString() {
        String actualResult = character.replaceOfTheGivenCharacter("1234");
        assertEquals("1234", actualResult);
    }

    @Test
    public void givenNullStringReturnsNullString() {
        String actualResult = character.replaceOfTheGivenCharacter("");
        assertEquals("", actualResult);
    }
}