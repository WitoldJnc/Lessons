package application.models;

public class StudentGroup {

    private int group_id;
    private int student_id;
    private int discipline_id;


    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getDiscipline_id() {
        return discipline_id;
    }

    public void setDiscipline_id(int discipline_id) {
        this.discipline_id = discipline_id;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group_id=" + group_id +
                ", student_id=" + student_id +
                ", discipline_id=" + discipline_id +
                '}';
    }

    public static StudentGroup createGroup(int group_id, int student_id, int discipline_id) {
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.setGroup_id(group_id);
        studentGroup.setStudent_id(student_id);
        studentGroup.setDiscipline_id(discipline_id);
        return studentGroup;
    }

}
