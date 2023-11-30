import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {
        try {
            int age = getAgeFromUser();
            System.out.println("Age entered: " + age);

        } catch (NegativeAgeException e) {
            System.err.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Execution completed.");
        }
    }

    private static int getAgeFromUser() throws NegativeAgeException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }

        return age;
    }
}

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}
