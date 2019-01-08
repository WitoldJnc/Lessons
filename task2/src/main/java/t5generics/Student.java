package t5generics;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;

    private Map<Group, Number> groups = new HashMap<Group, Number>();

    public Student(String name){
        this.name = name;

    }


    public String getName() {
        return name;
    }



    public Group[] getGroups(){
        Group[] output = groups.keySet().toArray(new Group[groups.size()]);
        return output;
    }



    public void addGroup(Group newGroup){
        if(!groups.containsKey(newGroup)){
            groups.put(newGroup, 0);
            newGroup.addStudent(this);
        }
    }

    public void setRating(Group group, Number mark){

        if(groups.containsKey(group)){
            groups.put(group, group.getSubject().set(mark));

        }else{
            System.out.println("no student in this group");
        }
    }


    public Number getRating(Group group){
        if(groups.containsKey(group)){
            return groups.get(group);
        }else{
            System.out.println("no student in this group");
            return null;
        }
    }

    public Number[] getFullRating(){
        Number[] output = groups.values().toArray(new Number[groups.size()]);
        return output;
    }

    public String getMarksBySubject(){

        StringBuilder profile = new StringBuilder("");
        profile.append(this.getName())
                .append("\n");
        Group[] groups = this.getGroups();

        for(int i=0; i<groups.length; i++){
            profile.append(groups[i].getSubject())
                    .append(" : ")
                    .append(getRating(groups[i]))
                    .append("\n");
        }
        return profile.toString();
    }
}