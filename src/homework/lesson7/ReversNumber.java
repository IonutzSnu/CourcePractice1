package homework.lesson7;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        int num = 0;
        int revers = 0;
        System.out.println("Input your number and press enter: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0) {
            revers = revers * 10;
            revers = revers + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of input number is: " + revers);
    }
}
