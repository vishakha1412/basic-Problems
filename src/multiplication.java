import java.util.Scanner;

class multiplication {
    public static void main(String[] args) {

        System.out.println("print multiplication of given number=");
        Scanner input=new Scanner(System.in);
        System.out.print("enter number = ");
        int num=input.nextInt();
        int table=table(num);
    }
    public static int table(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }
        return(num*i);
    }
}