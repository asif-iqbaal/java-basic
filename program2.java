// convert the kilometer into miles.
import java.util.Scanner;
public class program2{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("enter the kilometer\n");
        int a = p.nextInt();
        System.out.println(0.621371*a);
    }
}