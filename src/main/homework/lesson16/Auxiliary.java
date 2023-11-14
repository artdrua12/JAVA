package main.homework.lesson16;

import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Auxiliary {
    public static List<Integer> filter(Exchanger<String> exchanger) {
        return exchanger.map(Integer::valueOf)
                .filter(el -> el % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }
}
