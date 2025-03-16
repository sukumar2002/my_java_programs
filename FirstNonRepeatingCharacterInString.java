public class FirstNonRepeatingCharacterInString {
    static char firstnonRepeating(String s){
        char[] ch=s.toCharArray();
        int[] freq=new int[256];
        for(char c:ch){
            freq[c]++;
        }
        for(char c:ch){
            if(freq[c]==1){
                return c;
            }
        }
        return '_';
    }
    public static void main(String[] args) {
        String str="hello world";
         System.out.println("First non-repeating charcter:"+ firstnonRepeating(str));

    }
}
