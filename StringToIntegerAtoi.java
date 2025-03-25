public class StringToIntegerAtoi {
    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, sign = 1, result = 0, n = s.length();

        while (i < n && s.charAt(i) == ' ') i++; // Ignore leading spaces
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            sign = (s.charAt(i++) == '-') ? -1 : 1; // Handle sign

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; // Handle overflow
            result = result * 10 + digit;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String[] testCases = {
                "42", "   -42", "4193 with words", "words and 987", "-91283472332",
                "91283472332", "0", "+1", "-1", "0000000000012345678", "   ", "+", "-",
                "   +0 123", "2147483646", "-2147483647", "-2147483648", "2147483648", "-2147483649",
                "   00042", "00000-42", "-00000000000000000000000042", "3.14159", "   +000200",
                "-000000000000000001", "   -42abc78", "   -0012a42", "   18446744073709551617",
                "   -9223372036854775808", "   2e10", "   +2147483647", "   -2147483648",
                "   2147483649", "   -2147483649", "   ±123", "   #$%123", "   \t\n123", "   1 2 3"
        };

        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\" → Output: " + myAtoi(test));
        }
    }
}
