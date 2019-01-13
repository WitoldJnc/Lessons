
import java.util.ArrayList;
import java.util.List;

public class FunctionalList {

    private List<Integer> marklist = new ArrayList<>();


    public List<Integer> returnRandomMark() {
        for (int i = 0; i < 7; i++) {
            Integer random = (int) (Math.random() * 30);
            marklist.add(random);

        }
        System.out.println("random");
        return marklist;

    }

    public Number returnSumAllMark() {
        Integer sum = 0;
        for (Integer integer : marklist) {
            sum += integer;
        }
        System.out.println("sum");
        return sum;
    }

    public Number returnAverageMark() {
        Integer sum = 0;

        for (Integer integer :marklist) {
            sum += integer;
        }
        System.out.println("average");
        return (double)sum/marklist.size();
    }



}
