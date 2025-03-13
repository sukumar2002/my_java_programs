import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesInString {
    static void remove(String str){
          char[] c=str.toLowerCase().toCharArray();
        Set<Character> s=new LinkedHashSet<>();
       for(char st:c){
           s.add(st);
       }
        for (char ch : s) {
            System.out.print(ch);
        }
        System.out.println();
    }
    public static void main(String[] args) {
       String str="Communication";
       RemoveDuplicatesInString.remove(str);
    }
}
