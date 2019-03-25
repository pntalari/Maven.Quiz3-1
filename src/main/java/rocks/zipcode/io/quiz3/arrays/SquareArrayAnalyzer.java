package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        Integer[] squares = squareNums(inputArray);
        List<Integer> listSquared = Arrays.asList(squaredValues);
        for (int i = 0; i <squares.length ; i++) {
            if(listSquared.contains(squares[i])){
                return true;
            }
        }

        return false;
    }

    private static Integer[] squareNums(Integer[] inputArray) {
        Integer[] squaredArr = new Integer[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            squaredArr[i] = inputArray[i] * inputArray[i];
        }
        return squaredArr;
    }
}
