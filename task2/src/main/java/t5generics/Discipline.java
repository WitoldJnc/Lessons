package t5generics;

public enum Discipline {

    Russian {
        public Integer set(Number mark) throws IllegalArgumentException {
            if (mark instanceof Integer) {
                return (Integer) mark;
            } else {
                throw new IllegalArgumentException("mark must be int type");
            }
        }
    },

    English {
        public Double set(Number mark) throws IllegalArgumentException {
            if (mark instanceof Double) {
                return (Double) mark;
            } else {
                throw new IllegalArgumentException("mark must be double type");
            }
        }
    };

    public abstract Number set(Number mark) throws IllegalArgumentException;

}