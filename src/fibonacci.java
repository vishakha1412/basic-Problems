import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        System.out.println("fibonacci series");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int series=fib(num);
        System.out.println("fibonacci serie = "+series);

    }
    public static int fib(int num){
        if(num<0) return 0;
        System.out.println("0");
        if(num==0) return 1;
        System.out.println("1");

        int first=0,second=1;
        while((first+second)<=num){
            int third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }
        return 0;
    }
}
