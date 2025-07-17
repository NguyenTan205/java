import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class resultFizzBuzzTest {

    @Test
    void soAm () {
        int number = -1;
        String expected = "Vui long nhap so nguyen > 0" ;

        String result = resultFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void chiaHet3Va5 () {
        int number = 15;
        String expected = "FizzBuzz";

        String result = resultFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void chiaHet3 () {
        int number = 6;
        String expected = "Fizz";

        String result = resultFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void chiaHet5 () {
        int number = 10;
        String expected = "Buzz";

        String result = resultFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void khongChiaHetSoNao () {
        int number = 8;
        String expected = String.valueOf(number);
        String result = resultFizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }


}