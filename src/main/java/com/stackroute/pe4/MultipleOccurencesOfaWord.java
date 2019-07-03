package main.java.com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurencesOfaWord {
    /*
    occurences of a word in given input
     */
    String str="";
    public String check(String word, String input) {

        String inputString=input.toLowerCase();
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(inputString);

        int count = 0;
        while(matcher.find()) {
            count++;
            str=str+"found: "
                    + matcher.start() + " - " + matcher.end();

        }

        return str;

    }
}
