import org.junit.Test;

import static org.junit.Assert.*;

public class GnomeSortTest {

    @Test
    public void gnomeSort() {
        GnomeSort myGnomeSort = new GnomeSort();
        Comparable[] toSort ={4,5,2,1,3};
        Comparable[] newSort = myGnomeSort.gnomeSort(toSort,toSort.length);
        Comparable[] sorted ={1,2,3,4,5};
        assertEquals(newSort,sorted);

    }
}