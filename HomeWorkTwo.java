/**
 * Java1 HomeWork #2
 *
 * @author Dushankovskiy Alexandr
 * @version 13.12.2021
 */
class HomeWorkTwo {
    public static void main(String[]arge) {
        System.out.println(within10and20(5, 1));
        isPositiveOrNegative(8);
        System.out.println(isNegative(-5));
        System.out.println(isYearLeap(2021));
        repeatString("Hello, Java. ", 4);
    }

    static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void isPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "true" : "false");
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void repeatString(String s, int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(s);
        }
    }
    static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
