import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        MergeSort myMergeSort = new MergeSort();
        Comparable[] toSort ={4,5,2,1,3};
        Comparable[] newSort = myMergeSort.sort(toSort,0,toSort.length-1);
        Comparable[] sorted ={1,2,3,4,5};
        assertEquals(newSort,sorted);
    }
}