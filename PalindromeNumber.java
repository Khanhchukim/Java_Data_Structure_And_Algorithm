
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Convert the number to a string
        String str = Integer.toString(x);
        int length = str.length();

        // Check if the string reads the same forwards and backwards
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Examples to test the function
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false
    }
}