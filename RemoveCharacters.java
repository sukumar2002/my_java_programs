
public class RemoveCharacters {
    static String removeCharacters(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for(int i = 0; i < ch1.length; i++) {
            boolean isToRemove = false;
            
            for(int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    isToRemove = true;
                    break;
                }
            }
            if (!isToRemove) 
                sb.append(ch1[i]);     
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "India is great";
        String str2 = "In";
        // Output: da s great
        System.out.println("After remove duplicate characters:"+removeCharacters(str1, str2));
    }
}
