import java.util.Scanner;

public class program4{

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("enter the url\n");
        String url = a.nextLine();

        if(url.endsWith("com")){
            System.out.print("commertial websites\n");
        }else if(url.endsWith("org")){
            System.out.print("organisation websites\n");
        }else if(url.endsWith("in")){
            System.out.print("indian websites\n");
        }
    }
}