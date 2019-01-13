
import java.util.*;

public class FunctionalMap {
    private Map<String, List<Integer>> markList = new HashMap<>();


    public void addMark(String key, Integer value) {
        List<Integer> listmark = new ArrayList<>();
        listmark.add(value);
        markList.put(key, listmark);
    }


    public Number getSumOfMap() {
        Integer sum = 0;
        for (List<Integer> value : markList.values()) {
            for (int i = 0; i < value.size(); i++) {
                sum += value.get(i);
            }
        }
        return sum;
    }

    public List<Integer> getAverageMarkOfMapForEach() {
        List<Integer> intlist = new ArrayList<>();

        for (List<Integer> value : markList.values()) {
            Integer sum = 0;
            Integer averege = 0;
            for (int i = 0; i < value.size(); i++) {
                sum += value.get(i);

            }
            averege = sum/value.size();
            intlist.add(averege);
        }
        return intlist;
    }


    public Number getAllAverage(){
        List<Integer> intlist = new ArrayList<>();
        Integer sum = 0;

        for(List<Integer> value : markList.values()){
            for (int i = 0; i < value.size(); i++) {
                sum += value.get(i);
            }
            intlist.add(sum);
        }

        return (double)sum/intlist.size();
    }

}
