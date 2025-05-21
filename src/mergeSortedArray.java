import java.util.Arrays;

class mergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = { 1,2,3,4,5,6,7,8,9};
        int[] num2 = {  32,3,4,5};
        int[] ans = merges(num1, num2);
        System.out.println(Arrays.toString(ans));
    }
    /* public static List<Integer> merge(int[] num1, int[] num2){
         List<Integer> ans=new ArrayList<>();
         for(int i=0;i<num1.length;i++){
             for(int j=0;j<i;j++){
                 if(num1[i]>num2[j]){
                     ans.add(num2[j]);

                 } else{
                     ans.add(num1[i]);
                 }
             }
         }
         return ans;
     }*/

    public static int[] merges(int[] num1, int[] num2) {
        int size = num1.length + num2.length;
         int[] newarray=new int[size];
         int i=0,j=0,k=0;
         while(i<num1.length && j<num2.length){
             if( j==num2.length||num1[i]<num2[j]){
                 newarray[k]=num1[i];
                 i++;
                 k++;
             }
             if(i==num1.length||num1[i]>num2[j]) {
                 newarray[k]=num2[j];
                 j++;
                 k++;
             }
         }
         return newarray;
    }
}
