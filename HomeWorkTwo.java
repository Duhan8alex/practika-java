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
        printTab();
    }

    static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum <= 20 && sum >= 10) {
            return true;
        } else {
            return false;
        }
    }

    static void isPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "true" : "false");
    }

    static boolean isNegative(int a) {
        return a < 0; 
        }

        static void printTab() {
            for (int j = 0; j < 10; j++) {
                System.out.print("word ");
            }
        }
    }
