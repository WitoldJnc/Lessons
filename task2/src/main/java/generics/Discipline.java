package generics;

public enum Discipline {

    RUSSIAN(Integer.class), ENGLISH(Double.class), HISTORY(Integer.class);

    Class<? extends Number> markType;

    Discipline(Class<? extends Number> markType) {
        this.markType = markType;
    }
}