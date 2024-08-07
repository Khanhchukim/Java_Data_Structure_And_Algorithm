import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static int romanToInt(String s) {
        // Create a map of Roman numerals and their corresponding integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            // Get the value of the current Roman numeral character
            int currentVal = romanMap.get(s.charAt(i));

            // Check if the current value is less than the next value
            if (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                // Subtract the current value
                total -= currentVal;
            } else {
                // Add the current value
                total += currentVal;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        // Examples to test the function
        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("IV"));     // Output: 4
        System.out.println(romanToInt("IX"));     // Output: 9
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV"));// Output: 1994
    }
}