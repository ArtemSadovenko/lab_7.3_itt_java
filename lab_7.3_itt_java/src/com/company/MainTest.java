package com.company;

import org.junit.Assert;

import static com.company.Main.num;
import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void TestNum() {
        int[][]a = new int[2][2];
        int max;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = 0;
            }
        }



        max = num(a, 2, 2, 0);
        Assert.assertEquals(max, 0);
    }
}