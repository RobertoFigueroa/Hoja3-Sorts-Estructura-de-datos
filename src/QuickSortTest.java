import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
        QuickSort mysort = new QuickSort();
        Comparable[] toSort ={4,5,2,1,3};
        Comparable[] newSort = mysort.quickSort(toSort,0,toSort.length-1);
        Comparable[] sorted ={1,2,3,4,5};
        assertEquals(newSort,sorted);
    }
}