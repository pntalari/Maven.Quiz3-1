package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static final Character[] vowelsArr = {'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'};

    public static Boolean hasVowels(String word) {
        for (int i = 0; i <word.length() ; i++) {
            if(isVowel(word.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static Boolean startsWithVowel(String word) {
        if (isVowel(word.charAt(0)))
            return true;
        return false;
    }

    public static Boolean isVowel(Character character) {
        for (Character c : vowelsArr) {
            if (character.equals(c)) {
                return true;
            }
        }
        return false;
    }
}
