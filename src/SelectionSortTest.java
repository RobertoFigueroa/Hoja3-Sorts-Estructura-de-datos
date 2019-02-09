import static org.junit.Assert.*;

public class SelectionSortTest {

    @org.junit.Test
    public void sort() {
        SelectionSort testSort = new SelectionSort();
        Comparable[] toSort ={4,5,2,1,3};
        Comparable[] newSort = testSort.sort(toSort);
        Comparable[] sorted ={1,2,3,4,5};
        assertEquals(newSort,sorted);


    }
}