public class AssertionExample {

    /**
     * Main method to demonstrate assertion usage.
     * 
     * @param args Command line arguments. The first argument should be an integer.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command line argument.");
            System.out.println("Usage: java AssertionExample <number>");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            validateNumber(num);
            System.out.println("Pass");
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid integer.");
        }
    }

    /**
     * Validates if the given number is within the specified range.
     * 
     * @param num The number to be validated.
     */
    private static void validateNumber(int num) {
        assert num >= 10 : "Number should be greater than or equal to 10";
        assert num < 20 : "Number should be less than 20";
    }
}