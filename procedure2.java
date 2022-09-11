import java.util.Arrays;
import java.util.Scanner;

public class procedure2 {
    public static void main(String[] args) {
        int[] array = new int[200];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        int n = 0;
        int m = 0;
        int count = 2147483647;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value > -101 && value < 101) {
                n = value + 100;
                array[n] = array[n] + 1;
            } else if (value == -101) break;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < count && array[i] != 0) {
                count = array[i];
                m = i;
            }
        }
        System.out.println(m - 100);
    }
}