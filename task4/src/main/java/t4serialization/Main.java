package t4serialization;

public class Main {
    public static void main(String[] args) {
        String path = "task4/src/main/java/t4serialization/Films.bin";

        FilmCollection filmCollection = new FilmCollection();

        /*
        изначальная коллекция фильмов. фильм 1 и фильм 2. сохраненна в films.bin
         */

//        filmCollection.addfilm("Film1", "Ac1", "Ac2");
//        filmCollection.addfilm("Film2", "Ac3", "Ac4");
//        filmCollection.save(path);

        /*
        загрузим коллекцию фильмов, добавим еще один фильм "film3", изменим название "film1" на "just film"
         */

        filmCollection.load(path);
        filmCollection.addfilm("film3", "Ac5", "Ac2");
        filmCollection.changeFilmtitle("Film1", "Just film");

        /*
        теперь в коллекции 3 фильма. "just film", "film2", "film3"
         */

        filmCollection.showInfo();

        /*
        сохраняем для дальнейшего использования (нет)
         */

        filmCollection.save(path);


    }
}
