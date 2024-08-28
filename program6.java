// convert integer into binanry number 
import java.util.Scanner;

public class program6{
    public static void main(String[] args) {
         int[] sum = new int[32]; 
        int r , i =0;
        System.out.println("enter the number \t");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();


        while(num>0){
            r = num%2;
            sum[i++] = r;
            num = num/2;
        }
       
       --i;
       while(i>=0){
        System.out.print(sum[i]+"\t");
        --i;
       }
    }
}