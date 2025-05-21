import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        System.out.println("different pattern");
        System.out.println("enter number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int pattern=pattern(num);
        System.out.println(pattern);

    }
    public static int pattern(int num){
        int i=1;
        while(i<=num){
            System.out.println( " * ");
            if(num<3){
                System.out.println(" * ");
            }
        }{

            i++;
        }
        return 0;
    }
}
