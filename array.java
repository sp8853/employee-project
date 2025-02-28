// public class array {
//     public static void main(String[] args) {
//          int[] rollNumbers = new int[10];
// for (int i = 0; i < rollNumbers.length; i++) {
//             rollNumbers[i] = i + 1;
//         }

//         System.out.println("Roll Numbers:");
//         for (int rollNumber : rollNumbers) {
//             System.out.println("Roll No: " + rollNumber);
//         }
//     }
// }

public class array {
    public static void main(String[] args) {
    int[] rollNumbers = new int[10];
    int i = 0;
        while (i < rollNumbers.length) {
            rollNumbers[i] = i + 1;
            i++;
        }
        System.out.println("Roll Numbers:");
        i = 0;
        while (i < rollNumbers.length) {
            System.out.println("Roll Number " + (i + 1) + ": " + rollNumbers[i]);
            i++;
        }
    }
}