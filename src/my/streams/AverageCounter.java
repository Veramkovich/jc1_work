package my.streams;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AverageCounter {

    public static Double averageInt(@NonNull List<Integer> numbers) {
        return numbers
                .stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(averageInt(List.of(1, 2)));
        System.out.println(averageInt(List.of()));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(null);
        list1.add(4);
        System.out.println(averageInt(list1));

        System.out.println(averageInt(null));
    }

}
