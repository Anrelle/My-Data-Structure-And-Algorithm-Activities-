import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Convert the word to lowercase to make the check case-insensitive
        String lowerCaseWord = word.toLowerCase();

     
        boolean isPalindrome = true;

        int length = lowerCaseWord.length();
        for (int i = 0; i < length / 2; i++) {
         
            if (lowerCaseWord.charAt(i) != lowerCaseWord.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}
