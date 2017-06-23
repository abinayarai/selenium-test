package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by anrai on 6/23/17.
 */
public class MyTest {
    int expectedValue = 10;
    @Test
    public void FirstTest() {
        int actualValue = 10;
        assertEquals(expectedValue, actualValue);
    }
}
