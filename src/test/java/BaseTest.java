import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseTest {
    @Test
    public void shouldReturnBelowZero() {
        BaseCalculator baseCalculator = new BaseCalculator();
        int a = 1;
        int b = 2;

        int actual = baseCalculator.subtract(a, b);
        int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAboveZero() {
        BaseCalculator baseCalculator = new BaseCalculator();
        int a = 5;
        int b = 2;

        int actual = baseCalculator.subtract(a, b);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
