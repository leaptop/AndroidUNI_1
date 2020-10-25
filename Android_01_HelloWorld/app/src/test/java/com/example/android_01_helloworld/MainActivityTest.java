package com.example.android_01_helloworld;

import junit.framework.TestCase;

import org.junit.Test;

public class MainActivityTest extends TestCase {
    MainActivity ma = new MainActivity();

    @Test
    public void testMin1() {
        int min1 = ma.min(3, 8);
        assertEquals(min1, 3);
    }    @Test
    public void testMin2() {
        int min1 = ma.min(5000, 3000);
        assertEquals(min1, 3000);
    }    @Test
    public void testMin3() {
        int min1 = ma.min(-120, 8);
        assertEquals(min1, -120);
    }    @Test
    public void testMin4() {
        int min1 = ma.min(0, 0);
        assertEquals(min1, 0);
    }

    @Test
    public void testMax1() {
        int max1 = ma.max(3, 7);
        assertEquals(max1, 7);
    }  @Test
    public void testMax2() {
        int max1 = ma.max(30000, 70000);
        assertEquals(max1, 70000);
    }  @Test
    public void testMax3() {
        int max1 = ma.max(-500, -400);
        assertEquals(max1, -400);
    }  @Test
    public void testMax4() {
        int max1 = ma.max(5, 5);
        assertEquals(max1, 5);
    }
}