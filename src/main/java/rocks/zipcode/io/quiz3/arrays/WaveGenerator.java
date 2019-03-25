package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String strLower = str.toLowerCase();
        List<String> listWave = new ArrayList<>();
        //   String[] arrWave = new String[]

        for (int i = 0; i < strLower.length(); i++) {
            if (Character.isLetter(strLower.charAt(i))) {
                listWave.add(StringUtils.capitalizeNthCharacter(strLower, i));
            }
        }
        return listWave.toArray(new String[listWave.size()]);
    }
}
