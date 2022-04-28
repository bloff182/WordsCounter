package com.bloff.words.tests;

import com.bloff.words.SimpleWordCounter;
import org.junit.Assert;
import org.junit.Test;


public class WordsTest {

    SimpleWordCounter simpleWordCounter = new SimpleWordCounter();

    @Test
    public void checkWordsCounter(){

        int number = simpleWordCounter.wordsCounter("Dzien do*bry pani z tak nie2 ok");
        Assert.assertEquals(4, number);

    }


}
