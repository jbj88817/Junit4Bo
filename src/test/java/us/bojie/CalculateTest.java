package us.bojie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Test
    public void add() throws Exception {
        assertEquals(6, new Calculate().add(3, 3));
    }
}