public class CountCharacterFrequency {
    static void countFrequency(String s) {
        int[] count = new int[256]; // Array for all ASCII characters
        
        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        // Print character frequencies
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "sukumar Savarapu @123!";
        countFrequency(str);
    }
}
