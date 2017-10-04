package us.bojie;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest2 {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void add() throws Exception {
    }

    @Test
    public void sub() throws Exception {
    }

    @Test
    public void mul() throws Exception {
    }

    @Test(expected = ArithmeticException.class)
    public void div() throws Exception {
        assertEquals(3, new Calculate().div(6,0));
    }

}