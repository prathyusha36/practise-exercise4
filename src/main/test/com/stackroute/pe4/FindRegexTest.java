package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.FindRegex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRegexTest {

        FindRegex regex;
    @Before
    public void setUp() throws Exception {
        regex=new FindRegex();
    }

    @After
    public void tearDown() throws Exception {
        regex=null;
    }
        @Test
        public void checkRegex1()
        {
            String word=new String("Harry");
            String str1=new String("This is Harry");
            boolean result=regex.checkRegex(str1,word);
            assertEquals(true,result);
        }
        @Test
        public void checkRegex2()
        {
            String word=new String("Harry");
            String str1=new String("This is Henry");
            boolean result=regex.checkRegex(str1,word);
            assertEquals(false,result);
        }
        @Test
        public void checkRegex3()
        {
            String word=new String("Harry");
            String str1=new String ("Welcome back Henry");
            boolean result=regex.checkRegex(str1,word);
            assertEquals(false,result);
        }

}