package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String currentWord = "";
            if (VowelUtils.startsWithVowel(words[i])) {
                currentWord = words[i] + "way";
            } else {
                Integer index = VowelUtils.getIndexOfFirstVowel(words[i]);
                if (index == null) {
                    currentWord = words[i] + "ay";
                } else if(index == -1){
                    index = 0;
                    currentWord = words[i].substring(index) + words[i].substring(0, index) + "ay";
                }
                else {
                    currentWord = words[i].substring(index) + words[i].substring(0, index) + "ay";
                }

            }
            words[i] = currentWord;

        }

        return String.join(" ", words);
    }
}
