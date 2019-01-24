import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FunctionalList {

    private List<Integer> marklist;

    public List<Integer> returnRandom() {
        marklist = new Random()
                .ints(0, 21)
                .limit(6)
                .boxed()
                .collect(Collectors.toList());
        return marklist;
    }

    public Number returnSumAllMark() {
        return marklist.stream()
                .mapToInt(Integer::intValue)
                .sum();

    }

    public Number returnAverageMark() {
        return marklist.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

    }

}
