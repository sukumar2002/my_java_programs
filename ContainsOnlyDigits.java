public class ContainsOnlyDigits {
    public static boolean onlyDigits(String str){
          // if(str==null || str.isEmpty()){
          //     return false;
          // }
          // for(int i=0;i<str.length();i++){
          //     if(str.charAt(i)<'0' || str.charAt(i)>'9'){
          //         return  false;
          //     }
          // }return true;
        return s!=null&&!s.isEmpty() && s.chars().allMatch(Character::isDigit);
    }
    public static void main(String[] args) {
        String str="aa";
        System.out.println(ContainsOnlyDigits.onlyDigits(str));
    }
}
