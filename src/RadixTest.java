import org.junit.Test;

import static org.junit.Assert.*;

public class RadixTest {

    @Test
    public void radixsort() {
        Radix testSort = new Radix();
        Comparable[] toSort ={4,5,2,1,3};
        Comparable[] newSort = testSort.radixsort(toSort,toSort.length);
        Comparable[] sorted ={1,2,3,4,5};
        assertEquals(newSort,sorted);
    }
}