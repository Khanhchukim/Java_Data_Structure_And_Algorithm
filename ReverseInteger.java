public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // Check if the reversed integer overflows
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            reversed = reversed * 10 + pop;
        }

        return reversed;
    }

    public static void main(String[] args) {
        ReverseInteger ReverseInteger = new ReverseInteger();
        
        // Test cases
        System.out.println(ReverseInteger.reverse(123));       // Output: 321
        System.out.println(ReverseInteger.reverse(-123));      // Output: -321
        System.out.println(ReverseInteger.reverse(120));       // Output: 21
        System.out.println(ReverseInteger.reverse(1534236469));// Output: 0 (since it overflows)
    }
}
