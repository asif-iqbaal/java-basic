// Write a Java program to calculate the modules of two numbers without using any inbuilt
// modulus operator.

import  java.util.Scanner;
public class program15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend \t");
        int num1 = sc.nextInt();
         System.out.println("enter divisor\t");
         int num2 = sc.nextInt();

        int Q = num1 / num2;
        System.err.println(Q);
        int result = num1 - (Q*num2);
        System.out.println("the mode is " + result);

    }
}