package application.models;

public class Marks {

    private int id;
    private int student_id;
    private int discipline_id;
    private int mark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", discipline_id=" + discipline_id +
                ", mark=" + mark +
                '}';
    }

    public static Marks createMark(int student_id, int discipline_id, int mark) {
        Marks newMark = new Marks();
        newMark.setStudent_id(student_id);
        newMark.setDiscipline_id(discipline_id);
        newMark.setMark(mark);
        return newMark;
    }

}
