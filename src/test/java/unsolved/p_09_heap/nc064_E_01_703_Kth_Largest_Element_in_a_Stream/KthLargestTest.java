package unsolved.p_09_heap.nc064_E_01_703_Kth_Largest_Element_in_a_Stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestTest {

    KthLargest sut;

    @Test
    public void test_1() {

        sut = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4, sut.add(3));
        assertEquals(5, sut.add(5));
        assertEquals(5, sut.add(10));
        assertEquals(8, sut.add(9));
        assertEquals(8, sut.add(4));

    }


}