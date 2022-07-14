package unsolved.p_08_tries.nc062_M_02_211_Design_Add_and_Search_Words_Data_Structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordDictionaryTest {

    WordDictionary sut = new WordDictionary();


    @Test
    public void test_1(){

        String word = "apple";
        sut.addWord(word);

        assertTrue(sut.search("apple"));

    }

    @Test
    public void test_2(){

        String word = "apple";
        sut.addWord(word);

        assertTrue(sut.search("a..le"));

    }

}