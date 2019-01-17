package application.models;

public class Disciplines {

    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "Disciplines{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static Disciplines createDiscipline(int id, String name) {
        Disciplines disciplines = new Disciplines();
        disciplines.setId(id);
        disciplines.setName(name);
        return disciplines;
    }

    public static Disciplines createDiscipline(String name) {
        Disciplines disciplines = new Disciplines();
        disciplines.setName(name);
        return disciplines;
    }
}
