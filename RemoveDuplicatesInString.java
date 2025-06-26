import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesInString {
    public static String removeDuplicates(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(map, 0) + 1);
		}

		StringBuilder sb=new StringBuilder(map.size());
		for(Map.Entry<Character, Integer> ss:map.entrySet()) {
			sb.append(ss.getKey());
		}
		return sb.toString();
    }
    public static void main(String[] args) {
       String str="Communication";
      System.out.println("After removing duplicates : " + removeDuplicates(s));
    }
}
