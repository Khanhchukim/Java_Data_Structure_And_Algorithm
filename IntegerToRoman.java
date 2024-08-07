public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Define arrays for Roman numeral symbols and their corresponding integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // StringBuilder to build the result
        StringBuilder roman = new StringBuilder();
        
        // Iterate through the values array
        for (int i = 0; i < values.length; i++) {
            // While the number is greater than or equal to the current value
            while (num >= values[i]) {
                // Append the corresponding symbol to the result
                roman.append(symbols[i]);
                // Subtract the current value from the number
                num -= values[i];
            }
        }
        
        return roman.toString();
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(intToRoman(58));   // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV"
    }
}