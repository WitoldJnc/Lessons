package generics;

import java.util.*;

public class Student {

    private String name;
    private Map<Group, List<Number>> groupList = new HashMap<>();


    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public Map<Group, List<Number>> getGroupList() {
        return groupList;
    }

    public void addGroup(Group newGroup) {
        if (!groupList.containsKey(newGroup)) {
            groupList.put(newGroup, new ArrayList<Number>());
            newGroup.addStudent(this);
        }
    }


    public <T extends Number> Number addMark(Group group, T mark) {
        if (groupList.containsKey(group)) {
            Class<? extends Number> markType = group.getSubject().markType;
            if (mark.getClass().equals(markType)) {
                groupList.get(group).add(mark);
            } else {
                System.out.println("wrong mark type");
            }
        }
        return mark;
    }


    public Number getAverageMark() {
        List<Number> rating = new ArrayList<>();
        double sum = 0.0;

        for (List<Number> values : groupList.values()) {
            for (Number number : values) {
                sum += number.doubleValue();
                if (sum != 0) {
                    rating.add(sum);
                }
            }
        }
        return (double) Math.round(sum / rating.size() * 100) / 100;
    }


    public <T extends Number> Number mapIsCollect(Group group, T num) {
        if (groupList.containsKey(group)) {
            for (List<Number> values : groupList.values()) {
                if (values.contains(num))
                    return num;
            }
        }
        return null;
    }

}