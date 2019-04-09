package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz4.fundamentals.StringEvaluator.getAllSubstrings;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        List<String> palindromes = new ArrayList<>();

        String [] temp = getAllSubstrings(string);
        for (int i = 0; i < temp.length; i++) {
            if (isPalindrome(temp[i])){
                palindromes.add(temp[i]);
                String str[] = new String[palindromes.size()];

                for (int j = 0; j < palindromes.size(); j++) {

                    str[j] = palindromes.get(j);
                }
                return str;
            }
        } return null;
    }

    public static Boolean isPalindrome(String string) {

        if (reverseString(string).equals(string)) {
            return true;
    }       return false;
    }

    public static String reverseString(String string) {

       StringBuilder reversed = new StringBuilder(string);
       return reversed.reverse().toString();
    }
}

