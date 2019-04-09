package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {

    public static String[] getAllSubstrings(String string) {

        //Use a hash-set rather than an arrayList to remove duplicates.
        Set<String> list = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                list.add(string.substring(i, j));
            }
        }
        String[] substrings = list.toArray(new String[list.size()]);
        return substrings;
    }


    public static String[] getCommonSubstrings(String string1, String string2) {

        String [] strArr1 = getAllSubstrings(string1);
        String [] strArr2 = getAllSubstrings(string2);
        List<String> list = new ArrayList<>();
        for (String a : strArr1) {
            for (String b : strArr2) {
                if (a.equals(b)) {
                    list.add(a);
                }
            }
        }
        String[] commonstrings = list.toArray(new String[list.size()]);
        return commonstrings;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        String [] strArr = getCommonSubstrings(string1, string2);
        int length = 0;
        String largest = "";
        for (String a : strArr) {
            if (a.length() > length) {
                length++;
                length = a.length();
                largest = a;
                return largest;
            }
        } return null;
    }
}
