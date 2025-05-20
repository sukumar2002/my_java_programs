public class InsertAnElementInArray {
    static int[] insert(int[] arr,int in,int pos){
        int[] newArr=new int[arr.length+1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos-1) {
                newArr[i] = in; // Insert new value
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr={3,1,7,8,9,20};
        int insert=19;
        int position=2;
        int[] updatedArr=insert(arr,insert,position);
        for(int num:updatedArr){
            System.out.print(num+" ");
        }
    }
}
