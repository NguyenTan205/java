import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNormalDay () {
        assertEquals("16/7/2025", NextDayCalculator.findNextDay(15, 7, 2025));
    }

    @Test
    void testEndOfMonth () {
        assertEquals("1/8/2025", NextDayCalculator.findNextDay(31, 7, 2025));
    }

    @Test
    void testEndOfFebruaryLeapYear () {
        assertEquals("29/2/2024", NextDayCalculator.findNextDay(28, 2, 2024));
    }

    @Test
    void testEndOfFenruaryNonLeapYear () {
        assertEquals("1/3/2023", NextDayCalculator.findNextDay(28, 2, 2023));
    }

    @Test
    void testEndOfYear () {
        assertEquals("1/1/2026", NextDayCalculator.findNextDay(31, 12, 2025));
    }

}