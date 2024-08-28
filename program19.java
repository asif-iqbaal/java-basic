// Write a Java program to rearrange all the elements of a given array of integers so that all 
// the odd numbers come before all the even numbers.
import java.util.Scanner;
public class program19{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 integer element");
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt(); 
        }
       for(int i = 0; i< arr.length; i++){
        for(int j = 0; j<arr.length; j++){
            if(arr[i]%2 != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}