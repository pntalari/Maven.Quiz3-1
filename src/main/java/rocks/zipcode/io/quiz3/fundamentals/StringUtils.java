package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new HashSet<>();
        for (int i = 0; i <string.length() ; i++) {
            for (int j = i+1; j <= string.length(); j++) {
                list.add(string.substring(i,j));
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] arr = getAllSubStrings(input);
        return arr.length;
    }
}
