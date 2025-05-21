import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        System.out.println("find factorial");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.println("factorial of given num = "+fact);

    }

    public static int factorial(int num) {
        int fact = 1;
        int i = 2;
        if (num < 2) {
            return 1;
        }
        while (i <= num) {
            fact = fact * i;
            i++;

        }
        return fact;
    }
}
