import java.util.Scanner;

public class program3{

    public static void main(String[] args){
        Scanner pay = new Scanner(System.in);
        System.out.print("enter your salary in lpa");
        float amount = pay.nextFloat();

        if(amount<250000){
            System.out.println("no need to pay tax\n");
        }
        else if(amount>=250000&& amount<500000){
            System.out.printf("tax will pay %f\t",(amount*5)/100);
        }else if(amount>=500000&& amount<1000000){
            System.out.printf("tax will pay %f\t",(amount*10)/100);
        }else{
            System.out.printf("tax will pay %f\t",(amount*20)/100);
        }
    }
}