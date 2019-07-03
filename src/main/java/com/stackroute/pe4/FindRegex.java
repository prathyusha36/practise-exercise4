package main.java.com.stackroute.pe4;

public class FindRegex {
    /*
    find regular expression harry in given string
     */
    public boolean checkRegex(String str1,String word)
    {
        if(str1.matches("(.*)Harry(.*)"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
