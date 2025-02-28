
import java.util.Arrays;
public class maximumarray {
   public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int max = findMax(array);
        System.out.println("Maximum element in the array is: " + max);
    }

    public static int findMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
    

