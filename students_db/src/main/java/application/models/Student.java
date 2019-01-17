package application.models;

public class Student {

    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Student createStudent(String name, int id) {
        Student student = new Student();
        student.setName(name);
        student.setId(id);
        return student;
    }

    public static Student createStudent(String name) {
        Student student = new Student();
        student.setName(name);

        return student;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
