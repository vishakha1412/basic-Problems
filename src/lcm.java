import java.util.Scanner;

class lcm {
    public static void main(String[] args) {
        System.out.println("least count multiple");
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number=");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();
        int lcm = lcm(num1, num2);
        System.out.println(lcm);
    }

    public static int lcm(int num1, int num2) {
        int i = 1;
        while (i <= num2) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;

        }
        return 0;

    }

}



