
import java.util.Scanner;

public class program10 {

    public static void main(String[] args) {
        int i = 0, sec;
        int[] time = new int[10];
        System.out.println("enter time in seconds");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > 0) {
            sec = num % 60;
            time[++i] = sec;
            num = num / 60;
        }

        for (int j = time.length - 1; j > 0; j--) {
            if(time[j] != 0){
            System.out.print(time[j] + " ");
            }
        }
    }
}
