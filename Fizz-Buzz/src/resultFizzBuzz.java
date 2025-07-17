import java.util.Scanner;

public class resultFizzBuzz {
    public static String checkFizzBuzz(int number) {
        if (number <= 0) {
            return "Vui long nhap so nguyen > 0";
        } else {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            }  else if (number % 5 == 0) {
                return "Buzz";
            } else  {
                return String.valueOf(number);
            }
        }
    }
}
