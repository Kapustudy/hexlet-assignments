package exercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static void main(String[] args) {

        System.out.println(scrabble("rkqodlw", "world"));
        System.out.println(scrabble("ajv", "java"));
        System.out.println(scrabble("avjafff", "JaVa"));
        System.out.println(scrabble("", "hexlet"));
    }
    public static boolean scrabble(String allowedChars, String word) {
        String[] allowedCharsArray = allowedChars.split("");
        String[] wordCharsArray = word.split("");
        List<String> allowedCharList = new ArrayList<>(Arrays.asList(allowedCharsArray));
        List<String> wordCharList = new ArrayList<>(Arrays.asList(wordCharsArray));

        for (String wordChar : wordCharList) {
            boolean flag = false;
            for (String allowedChar : allowedCharList) {
                if (allowedChar.equalsIgnoreCase(wordChar)) {
                    flag = true;
                    allowedCharList.remove(allowedCharList.indexOf(allowedChar));
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
//END
