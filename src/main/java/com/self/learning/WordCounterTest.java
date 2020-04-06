package com.self.learning;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


@RunWith(BlockJUnit4ClassRunner.class)
public class WordCounterTest {

    @Test
    public void testWordCounter_shouldReturnNumberOfWords() {
        String str="saveChangesInTheEditor";
        int counter = 1;

        counter += (int) str.chars().filter(Character :: isUpperCase).count();

        assertThat(counter, is(equalTo(5)));
    }
}
