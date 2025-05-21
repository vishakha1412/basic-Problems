 import java.util.Scanner;

 public class arrayutility {
     public static int[] inputArray() {
         Scanner input=new Scanner(System.in);
         System.out.println("please enter the number of elements: ");
         int size =input.nextInt();
         int[] nums =new int[size];
         int i=0;
         while(i<size) {
             System.out.println("please enter element no "+(1+i)+":");
             nums[i]=input.nextInt();
             i++;
         }
         return nums;
     }

     public static void displayArray(int[] nums){
         for(int i=0;i<nums.length;i++){
             System.out.println(nums+" ");
         }
     }
 }
