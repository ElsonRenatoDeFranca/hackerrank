package com.self.learning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class PrintStairCaseTest {

    @Test
    public void testPrintStairCase() {
        int n = 4;
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.setLength(n);

        for (int i = 0; i < n; i++)
            stringBuilder.append(" ");

        for (int i = 1; i <= n; i++) {
            int start = stringBuilder.length() - i;
            int end = stringBuilder.length() - j;
            stringBuilder.replace(start, end, "#");
            System.out.println(stringBuilder);
            j++;
        }

    }

}