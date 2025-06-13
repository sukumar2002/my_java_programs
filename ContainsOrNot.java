import java.util.*;

public class ContainsOrNot {
    public static boolean containsUsingSet(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (char ch : s1.toCharArray()) {
            set.add(ch);
        }
        for (char ch : s2.toCharArray()) {
            if (!set.contains(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] a) {
        String s1 = "351";
        String s2 = "531";
        System.out.println(containsUsingSet(s1, s2));
    }
}
