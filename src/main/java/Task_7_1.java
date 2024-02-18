//created by Vadim Peregud

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task_7_1 {

    public static void main(String[] args) {
        List<Long> randomNums = new Random()
                .longs(100, 0, 101)
                .boxed()
                .map(num -> (long) (num * Math.PI - 20))
                .filter(num -> num < 100)
                .sorted()
                .toList();

        Map<Long, String> numMap = randomNums.stream().
                skip(3)
                .collect(Collectors.toMap(num -> num, num -> ("Number: " + num), (a, b) -> a));

        System.out.println(randomNums);

        for (Map.Entry<Long, String> list : numMap.entrySet()) {
            System.out.println("Key: " + list.getKey() + " " + "    value " + list.getValue());
        }
    }
}
