package unsolved.p_05_binary_search.nc033_M_06_981_Time_Based_Key_Value_Store;

import org.junit.Test;
import unsolved.p_05_binary_search.nc033_M_06_981_Time_Based_Key_Value_Store.TimeMap;

import static org.junit.Assert.assertEquals;

public class TimeMapTest {

    TimeMap sut = new TimeMap();

    @Test
    public void test_1() {
        sut.set("foo", "bar", 1);
        assertEquals("bar", sut.get("foo", 1));
    }

    @Test
    public void test_2() {
        sut.set("love", "high", 10);
        sut.set("love", "low", 20);

        assertEquals("", sut.get("love", 5));
        assertEquals("high", sut.get("love", 10));
        assertEquals("high", sut.get("love", 15));
        assertEquals("low", sut.get("love", 20));
        assertEquals("low", sut.get("love", 25));
    }

}