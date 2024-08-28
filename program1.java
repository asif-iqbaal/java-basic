// program to great a person by6 asking name from the user keyboard.

import java.util.Scanner;
public class program1{

    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("enter your name\n");
        String s = p.nextLine();
        System.out.println("hello "+s+" have a great day\n");
    }
}