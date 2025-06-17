
public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:words) {
            StringBuilder sb=new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String str = "i love india";
        // output:i evol aidni
        System.out.println(reverseEachWord(str));

    }
}
