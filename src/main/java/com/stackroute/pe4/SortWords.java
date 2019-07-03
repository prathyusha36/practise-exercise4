package main.java.com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWords {
    //sort words in a given String
    public List<String> sortWordsOfString(String str) {
        String input=str.toLowerCase();
        List<String> list=Arrays.asList(input.split(" "));
        Collections.sort(list);
        System.out.println(list);

        return list;
    }
}

