package solved.p_08_tries.nc061_M_01_208_Implement_Trie;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrieTest {

    Trie sut = new Trie();

    @Test
    public void test_1(){

        String word = "apple";
        sut.insert(word);
        assertEquals('a', sut.root[0].c);

    }

    @Test
    public void test_2(){

        String word = "apple";
        sut.insert(word);

        assertTrue(sut.search(word));

    }

    @Test
    public void test_3(){

        String word = "apple";
        sut.insert(word);

        assertFalse(sut.search("app"));

    }

    @Test
    public void test_4(){

        String word = "apple";
        sut.insert(word);

        assertTrue(sut.startsWith(word));

    }

    @Test
    public void test_5(){

        String word = "app";
        sut.insert(word);

        assertTrue(sut.startsWith(word));

    }

}