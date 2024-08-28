
public class program17{
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {56,81,52,34,17};
        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
         for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}