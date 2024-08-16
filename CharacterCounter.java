import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string with length greater than 3: ");
        String inputString = scanner.nextLine();

        if (inputString.length() <= 3) {
            System.out.println("Invalid input: string length must be greater than 3.");
            return;
        }

        System.out.print("Please enter a character to search for: ");
        char searchChar = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                count++;
            }
        }

        System.out.printf("The character '%c' appears %d times in the string.\n", searchChar, count);
    }
}