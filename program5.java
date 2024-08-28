// to add binary number 
import java.util.Scanner;

public class program5{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first binary number \t");
        String binary1 = scanner.nextLine();

        System.out.println("enter second binary number \t");
        String binary2 = scanner.nextLine();

        // convert string into binary integers
        int num1 = Integer.parseInt(binary1,2);
        int num2 = Integer.parseInt(binary2,2);

        int sum = num1 + num2;

         String binarySum = Integer.toBinaryString(sum);

        System.out.println(binarySum);

        scanner.close(); 
    }
}