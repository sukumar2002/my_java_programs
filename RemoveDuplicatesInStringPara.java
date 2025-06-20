import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesInStringPara {
    public static String removeDuplicatesInWords(String s) {
//		Set<String> ns = new LinkedHashSet<>();
//		String[] words = s.split(" ");
//		for (String word : words) {
//			ns.add(word);
//		}
//		StringBuilder sb = new StringBuilder();
//		for (String st : ns) {
//			sb.append(st).append(" ");
//		}
//		return sb.toString();
        String result = Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));

        return result;

    }

    public static void main(String[] args) {
        String str = "java is is a programming language java a".trim();
        System.out.println(removeDuplicatesInWords(str));

    }
}