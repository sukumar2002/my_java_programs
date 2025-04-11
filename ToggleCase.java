public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                result.append((char) ch + 32);
            } else if (ch >= 97 && ch <= 122) {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
        public static void main (String[]args){
            String input = "hello sukumar!1234";
            String toggled = ToggleCase.toggleCase(input);
            System.out.println("Original: " + input);
            System.out.println("Toggled: " + toggled);
        }
    }
