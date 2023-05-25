package lesson19;

import java.util.List;
import java.util.Objects;

public class AverageCalculator {

    public final static Double DEFAULT_AVERAGE = 0.0;

    public Double average(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return DEFAULT_AVERAGE;
        }
        return list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElseGet(DEFAULT_AVERAGE::doubleValue);
    }

    public Integer getMinEvenNumber(List<Integer> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .filter(x -> x % 2 == 0)
                .min(Integer::compare)
                .orElse(0);
    }

}
