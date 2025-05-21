import java.util.Scanner;

class reverseadaigit {
    public static void main(String[] args) {
        System.out.println("reverse the given integer");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number you want to check=");
        int num = input.nextInt();
        int reverse=reverse(num);
        System.out.println("reverse integer is"+reverse);

    }

    public static int reverse(int num) {
        int newnum = 0;
        while (num > 0) {
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num=num/10;
        }
        return newnum;
    }
}
