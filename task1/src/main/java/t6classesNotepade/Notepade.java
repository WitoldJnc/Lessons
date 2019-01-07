package t6classesNotepade;


public class Notepade {
    private Entry[] notes;

    /**
     * constructor of notepade class
     * does not allow to set wrong size of note array
     */

    public Notepade(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("wrong notepade size");
        } else {
            notes = new Entry[size];
            System.out.println("notepade size: " + size);
        }
    }

    /**
     * @addNote method create a new text string inside a note array
     */

    public void addNote(String text) {
        try {
            for (int i = 0; i < notes.length; i++) {
                if (notes[i] == null) {
                    notes[i] = new Entry(text);
                    return;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("notepade is full");

        }
    }


    /**
     * @showInfo method show information of notepade notes. show index of note and message
     */

    public void showInfo() {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null) {
                System.out.println("index" + "(" + i + ")" + " : " + notes[i].getEntry());
            }
        }
        System.out.println();
    }

    /**
     * @delNote method "delete" a variable, set they value of "null"
     */

    public void delNote(int index) {
        try {
            if (index >= notes.length || index < 0) {

            }
            notes[index] = null;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("wrong delete index :[" + index + "]");
        }

    }


    /**
     * @editNote method change text of string
     */

    public void editNote(int index, String text) {
        try {
            if (index >= notes.length || index < 0) {
            }
            notes[index] = new Entry(text);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("wrong edit index :[" + index + "]");
        }
    }


}

