import java.util.Arrays;

public class procedure {
    public static void main(String[] args) {
        int[] array = {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        System.out.println(Arrays.toString(segnLeftArray(array)));
    }

    public static int[] segnLeftArray(int[] array) {
        int[] array1 = Arrays.stream(array).filter(x -> x != 0).toArray();
        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++){
            array3[i] = 0;
        }
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        return array3;
    }
}