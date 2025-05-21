import java.util.Scanner;

class primeNumber {
    public static void main(String[] args) {
        System.out.println("check whether given number is prime or not");
        Scanner input=new Scanner(System.in);
        System.out.println("enter number you want to check=");
        int num=input.nextInt();
        System.out.println(isPrime(num));
    }
    public static int isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                System.out.println("not");
            }else{
                System.out.println("is prime");
            }
            i++;
        }
        return 0;
    }
}
