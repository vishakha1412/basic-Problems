import java.util.Scanner;

class palindrme {
    public static void main(String[] args) {
        System.out.println("palindrome series");
        Scanner input=new Scanner(System.in);
        System.out.println("enter number you want to check ");
        int num=input.nextInt();
        int reverse=reverse(num);
       System.out.println(reverse);
       if(reverse==num){
           System.out.println("palindrome ");
       }else{
           System.out.println("not");
       }

        System.out.println("done");

    }
    public static int reverse(int num){
        int newnum=0;
        while(num>0){
            int digit=num%10;
            newnum=newnum*10+digit;
            num=num/10;
        }
        return newnum;
    }

    }

