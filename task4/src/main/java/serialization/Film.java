package serialization;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Film implements Serializable {
    private String filmTitle;
    private List<String> actors;

    public Film(String filmTitle, String... actors) {
        this.filmTitle = filmTitle;
        this.actors = Arrays.asList(actors);
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }


    @Override
    public String toString() {
        return "Film: [" + filmTitle + "] Actors: [" + actors + ']';
    }


}
