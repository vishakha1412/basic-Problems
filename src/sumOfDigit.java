import java.util.Scanner;

class sumOfDigit {
    public static void main(String[] args) {
        System.out.println("sum of digit of given integer");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum=digitSum(num);
        System.out.println("sum of all digit in integer is "+sum);

    }
    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
}
