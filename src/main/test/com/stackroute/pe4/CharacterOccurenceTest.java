package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.CharacterOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurenceTest {
    CharacterOccurence occurence;
    @Before
    public void setUp() throws Exception {
        occurence=new CharacterOccurence();
    }

    @After
    public void tearDown() throws Exception {
        occurence=null;
    }

    @Test
    public void countOfTheGivenCharacter() {
        int result=occurence.countOfTheGivenCharacter("My name is Prathyusha",'a');
        assertEquals(3,result);
    }
    @Test
    public void countOfTheGivenCapitalCharacter() {
        int result=occurence.countOfTheGivenCharacter("My name is Prathyusha",'M');
        assertEquals(1,result);

     }
     @Test
    public void givenACharacterNotInSentence() {
        int result=occurence.countOfTheGivenCharacter("My name is Prathyusha",'z');
        assertEquals(0,result);
     }
}