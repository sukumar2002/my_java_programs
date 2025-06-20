public class FirstNonRepeatingCharacterInString {
    static char firstnonRepeating(String s){
        // char[] ch=s.toCharArray();
        // int[] freq=new int[256];
        // for(char c:ch){
        //     freq[c]++;
        // }
        // for(char c:ch){
        //     if(freq[c]==1){
        //         return c;
        //     }
        // }
        // return '_';
        Map<Character,Integer> map=new LinkedHashMap<>();
    	for(char c:s.toCharArray()) {
    		map.put(c, map.getOrDefault(c, 0)+1);
    	}
    	for(Map.Entry<Character, Integer> c:map.entrySet()) {
    		if(c.getValue()==1) {
    			return c.getKey();
    		}
    	}
    	 return '\0';
    }
    public static void main(String[] args) {
        String str="hello world";
         System.out.println("First non-repeating charcter:"+ firstnonRepeating(str));
    }
}
