package unsolved.p_01_arrays_hash.nc008_M_08_271_Encode_and_Decode_Strings.at_02;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CodecTest {

    Codec sut = new Codec();

    @Test
    public void test_1(){

        List<String> strs = Arrays.asList("aaa", "bbb");

        String encoded = sut.encode(strs);

        List<String> actual = sut.decode(encoded);

        List<String> expected = Arrays.asList("aaa", "bbb");

        assertEquals(expected, actual);
    }


    @Test
    public void test_2(){

        List<String> strs = Arrays.asList("", "");

        String encoded = sut.encode(strs);

        List<String> actual = sut.decode(encoded);

        List<String> expected = Arrays.asList("", "");

        assertEquals(expected, actual);
    }

}