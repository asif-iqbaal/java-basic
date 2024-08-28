
import java.util.Scanner;

public class program13{
    public static void main(String[] args) {
        System.out.println("enter the sentences");
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        StringBuilder result = new StringBuilder(s.length());

        boolean capitalize = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (capitalize && Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                capitalize = false;
            } else {
                result.append(c);
            }
            if (c == ' ') {
                capitalize = true;
            }
        }

        System.out.println(result.toString()
        );
    }
}
