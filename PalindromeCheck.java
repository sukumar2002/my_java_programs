public class PalindromeCheck{
    public static boolean isPalindrome(String str) {
        if(str==null||str.isEmpty()){return false;}
        String lowerstr=str.toLowerCase();
        StringBuilder rev=new StringBuilder(lowerstr).reverse();
        return lowerstr.contentEquals(rev);
    }
    public static void main(String[] args){
        String str1="20012".trim();
        String str2="listen".trim();
        String str3="madam".trim();

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}
