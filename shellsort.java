import java.util.Arrays;

public class shellsort {
    public static void main(String[] args) {
        int m = (int) (200+Math.random()*10000);
        int [] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = (int) (0+Math.random()*99999);
        }
        int count = 0;
        long time3 = System.nanoTime();

        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                for (int j = i - step; j >= 0 && arr[j] > arr[j + step]; j -= step) {
                    int x = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = x;
                    count++;
                }
            }
        }

        long time4 = System.nanoTime();

        // System.out.println("number of elements: " + m); вывод массива
        System.out.println("sorted array: " + Arrays.toString(arr));
        System.out.println("nanoTime: " + (time4-time3));
        System.out.println("number of iterations: " + count);
    }
}