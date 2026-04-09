package org.ies.tierno;

import java.util.List;
import java.util.Optional;

public class Methods {
    public static Optional<String> first (List<String> list) {
        return list.stream()
                   .findFirst();
    }

    public static Optional<Integer> last (List<Integer> list) {
        if (list.size() == 0) {
            return Optional.empty();
        } else {
            return list.stream()
                    .skip(list.size() -1)
                    .findFirst();
        }
    }

    public static Optional<Double> sum (List<Double> numbers) {
        return numbers.stream()
                      .reduce((double1, double2) -> double1 + double2);
    }

    public static Optional<Double> average (List<Double> numbers) {
        return sum(numbers).stream()
                           .map(sum -> sum / numbers.size())
                           .findFirst();
    }

    public static Optional<Double> max (List<Double> numbers) {
        return numbers.stream()
                      .max((double1, double2) -> double1.compareTo(double2));
    }

    public static Optional<Double> min (List<Double> numbers) {
        return numbers.stream()
                      .min((double1, double2) -> double1.compareTo(double2));
    }

    public static List<Double> junction (List<Double> numbers1, List<Double> numbers2) {
        return numbers1.stream()
                       .filter(double1 -> numbers2.contains(double1))
                       .toList();
    }
}
