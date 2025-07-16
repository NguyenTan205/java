public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        // tinh so ngay trong thang hien tai
        int daysInMonth = getDaysInMonth(month, year);

        if (day < daysInMonth) {
            day++;
        } else {
            if (month < 12) {
                day = 1;
                month++;
            } else {
                day = 1;
                month = 1;
                year++;
            }
        }
        return day + "/" + month + "/" + year;
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else  {
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
    }
}
