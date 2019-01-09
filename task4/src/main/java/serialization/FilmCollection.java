package serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilmCollection implements Serializable {
    private List<Film> films = new ArrayList<>();


    public void addfilm(String filmTitle, String... actorName) {
        films.add(new Film(filmTitle, actorName));
    }

    public void showInfo() {
        for (Film eachFilm : films) {
            System.out.println(eachFilm);
        }
    }


    public void changeFilmtitle(String oldTitle, String newTitle) {
        for (Film each : films) {
            if (each.getFilmTitle().equals(oldTitle)) {
                each.setFilmTitle(newTitle);
            }
        }
    }


    public void save(String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(path))){

            oos.writeObject(films);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void load(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(path))) {

            films = (List<Film>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}