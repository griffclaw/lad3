package org.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;
public class MainTest {

    @Test
    public void taxEarningsTrue() {
        double a = Main.taxEarnings(100);
        assertEquals(6.01, a, 1);
    }
    @Test
    public void taxEarningsFalse() {
       double a = Main.taxEarnings(465);
        int c = -3;
        assertEquals(a, c);
    }
}