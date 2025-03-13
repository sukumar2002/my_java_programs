public class AnagramCheck {
    static boolean areAnagram(String s1,String s2){
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        if(s1.length()!=s2.length()){return false;}
        int[] charCount=new int[256];
        for(int i=0;i<s1.length();i++){
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }
       for(int count:charCount){
           if(count!=0){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args){
        String str1="Listen";
        String str2="silent";
        System.out.print("isAnagram:"+AnagramCheck.areAnagram(str1,str2));
    }
}
