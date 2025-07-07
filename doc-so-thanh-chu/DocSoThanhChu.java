import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Hỏi số cần đọc
        System.out.print("Enter a number to read (0 - 999): ");
        int number = scanner.nextInt();

        // Kiểm tra giới hạn
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            // Bước 2: Đọc số có 1 chữ số
            System.out.println(readOneDigit(number));
        } else if (number < 20) {
            // Bước 3: Đọc số hai chữ số nhỏ hơn 20
            System.out.println(readTeen(number));
        } else if (number < 100) {
            // Bước 4: Đọc số hai chữ số lớn hơn hoặc bằng 20
            System.out.println(readTwoDigits(number));
        } else {
            // Bước 5: Đọc số có ba chữ số
            System.out.println(readThreeDigits(number));
        }
    }

    // Đọc số có 1 chữ số
    public static String readOneDigit(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "Out of ability";
        }
    }

    // Đọc các số từ 10 đến 19
    public static String readTeen(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "Out of ability";
        }
    }

    // Đọc các số từ 20 đến 99
    public static String readTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String result = "";

        switch (tens) {
            case 2: result = "twenty"; break;
            case 3: result = "thirty"; break;
            case 4: result = "forty"; break;
            case 5: result = "fifty"; break;
            case 6: result = "sixty"; break;
            case 7: result = "seventy"; break;
            case 8: result = "eighty"; break;
            case 9: result = "ninety"; break;
        }

        if (ones != 0) {
            result += " " + readOneDigit(ones);
        }

        return result;
    }

    // Đọc các số từ 100 đến 999
    public static String readThreeDigits(int number) {
        int hundreds = number / 100;
        int remainder = number % 100;

        String result = readOneDigit(hundreds) + " hundred";

        if (remainder != 0) {
            result += " and ";
            if (remainder < 10) {
                result += readOneDigit(remainder);
            } else if (remainder < 20) {
                result += readTeen(remainder);
            } else {
                result += readTwoDigits(remainder);
            }
        }

        return result;
    }
}
