public class LengthOfEachWord{
    static void lengthOfEachString(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=s.length();i++){
            int count=0;
            if(i<s.length() && s.charAt(i)!=' '){
                sb.append(s.charAt(i));
                count++;
            }else{
                count=sb.length();
                System.out.println(sb.toString()+" Length is "+count);
                sb.setLength(0);
                count=0;
            }
        }

    }
    public static void main(String[] args) {
        String str="i love india".trim();
        LengthOfEachWord.lengthOfEachString(str);

    }
}