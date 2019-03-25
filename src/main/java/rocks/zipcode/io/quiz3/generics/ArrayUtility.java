package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType num: array){
            if (getNumberOfOccurrences(num) % 2 != 0){
                return num;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
       for(SomeType num: array){
            if (getNumberOfOccurrences(num) % 2 == 0){
                return num;
            }
        }
       return null;

    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Long result = Arrays.stream(array)
                .filter(val -> val == valueToEvaluate).count();
        return result.intValue();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return Arrays.stream(array)
                .filter(x -> predicate.apply(x))
                .toArray(size -> Arrays.copyOf(array, size));
    }
}
