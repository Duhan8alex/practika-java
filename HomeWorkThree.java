/**
 * Java1 HomeWork #3
 *
 * @author Dushankovskiy Alexandr
 * @version 16-20.12.2021
 */
import java.util.Arrays;
import java.util.Random;

class HomeWorkThree {
    public static void main(String arr[]) {
        invertArray();
        fillArray(100, 1);
        changeArray();
        fillDiagonal();
        fillArrays(14, 5);
    }
    
    static void invertArray() {
        int[]arr = {0, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillArray(int length, int value ) {
        int[]arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            value += 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void changeArray() {
        int[]arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillDiagonal() {    
        String[][] cross = new String [5][5]; 
        for(int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross[i].length; j++) {
                cross[i][j] = (j == i || j == cross.length - 1 - i) ? "1" : " ";
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
    }
        
        static void fillArrays(int len, int initialValue) {
        int[]arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
    }

