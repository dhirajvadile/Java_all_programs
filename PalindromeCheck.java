import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces for uniform comparison
        input = input.toLowerCase().replaceAll("\\s+", "");

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Check if palindrome
        if (input.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
    }
}
