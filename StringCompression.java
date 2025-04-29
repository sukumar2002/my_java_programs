public class StringCompression {
    public static String compressString(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1; // reset count
            }
        }
        // Append the last character and its count
        result.append(input.charAt(input.length() - 1)).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaabb";
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }
}
