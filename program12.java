// Write a Java program to accept an integer and count the factors of the number.

import java.util.Scanner;

public class program12 {

    static int factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println(factors(num));
        sc.close();  
    }
   
}
