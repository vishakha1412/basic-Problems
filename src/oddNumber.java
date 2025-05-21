import java.util.Scanner;

class oddNumber {
    public static void main(String[] args) {
        System.out.println("sum of all odd number=");
        Scanner input=new Scanner(System.in);
        System.out.println("enter number till which you want to add");
        int num=input.nextInt();
        int sum=oddSum(num);
        System.out.println("odd sum till given number"+sum);
    }
    public static int oddSum(int num){
     int i=1;
     int sum=0;
     while(i<=num){
         sum=sum+i;
         i=i+2;
     }
     return sum;


    }
}
