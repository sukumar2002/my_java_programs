public class URLify {
    public static String replaceSpaces(String str){
        StringBuilder res=new StringBuilder();
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch==' '){
               res.append("#20");
           }else{
               res.append(ch);
           }
       }
       return res.toString();
    }
    public static void main(String[] args) {
        String str="Mr sukumar savarapu";
        String res=URLify.replaceSpaces(str);
        System.out.println(res);
    }
}
