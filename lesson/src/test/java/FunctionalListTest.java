import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionalListTest {

    @Test
    public void sum() {
        FunctionalList list = new FunctionalList();
        int actual = list.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}