package generics;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;

    private Map<Group, Number> groupList = new HashMap<>();

    public Student(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public Group[] getGroupList() {
        Group[] output = groupList.keySet().toArray(new Group[groupList.size()]);
        return output;
    }


    public void addGroup(Group newGroup) {
        if (!groupList.containsKey(newGroup)) {
            groupList.put(newGroup, 0);
            newGroup.addStudent(this);
        }
    }


    public <T extends Number> void setRating(Group group, T mark) {

        if (groupList.containsKey(group)) {
            Class<? extends Number> markType = group.getSubject().markType;
            if (mark.getClass().equals(markType)) {
                groupList.put(group, mark);
            } else {

            }
        } else {
            System.out.println("no student in this group");
        }
    }


    public Number getRating(Group group) {
        if (groupList.containsKey(group)) {
            return groupList.get(group);
        } else {
            System.out.println("no student in this group");
            return null;
        }
    }


    public String getMarksBySubject() {

        StringBuilder profile = new StringBuilder("");
        profile.append(this.getName())
                .append("\n");
        Group[] groups = this.getGroupList();

        for (int i = 0; i < groups.length; i++) {
            profile.append(groups[i].getSubject())
                    .append(" : ")
                    .append(getRating(groups[i]))
                    .append("\n");
        }
        return profile.toString();
    }


}