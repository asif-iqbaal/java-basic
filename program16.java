
import java.util.Arrays;

public class program16{
    public static void main(String[] args){
        int[] arr ={20,30,40};
        int[] arr1 = new int[3];
        int length = arr1.length-1 ;
        for (int i = 0; i < arr.length; i++){
            if(i==0){
                arr1[length] = arr[i];

            }else if(i == arr.length -1){
                arr1[0] = arr[i];
            }else{
                arr1[i] = arr[i];
            }
        }
        System.out.println( Arrays.toString(arr1));
    }
}