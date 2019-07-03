package main.java.com.stackroute.pe4;

import java.util.Scanner;

public class CharacterOccurence {
    // Method that return count of the given
    // character in the string
    public static int countOfTheGivenCharacter(String sentence, char c) {
        int numberOfTimes = 0;
        numberOfTimes = sentence.length() - sentence.replaceAll(String.valueOf(c), "").length();
        return numberOfTimes;


    }
}


