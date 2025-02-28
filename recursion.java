public class recursion {
    public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int sum = sumArray(array);
            System.out.println("Sum of array elements: " + sum);
        }
    
        /**
         * Calculates the sum of all elements in an array.
         *
         * array the input array
         * return the sum of all elements in the array
         */
        public static int sumArray(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
    }