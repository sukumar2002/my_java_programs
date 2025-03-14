public class SubStringInString {
    static void subString(String str){
        int n = str.length();
        char[] charArray = str.toCharArray(); // Convert string to character array

        for (int i = 0; i < n; i++) { // Start index
            for (int j = i; j < n; j++) { // End index
                // Manually extract substring using character array
                for (int k = i; k <= j; k++) {
                    System.out.print(charArray[k]);
                }
                System.out.println(); // New line after each substring
            }
        }
    }
    public static void main(String[] args) {
         String str="abc";
         subString(str);
    }
}
