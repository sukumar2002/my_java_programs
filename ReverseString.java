public class ReverseString {

    public static String reverse(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("String is empty");
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        try {
            String str = "q123 s daad s".trim();
            System.out.println("Reverse String is:" + reverse(str));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
