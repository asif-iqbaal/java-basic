import java.io.Console;

public class program7{
    public static void main(String[] args) {
        Console cons;

        if((cons = System.console()) !=null )
        {
            char[] pass_word = null;
            try {
                pass_word = cons.readPassword("enter password");
                System.out.println("your password is " + new String(pass_word));
            } finally {
                    // Ensure that the password array is securely cleared.
                if (pass_word != null) {
                    java.util.Arrays.fill(pass_word, ' ');
                }
            }

        }
        else{
            throw new RuntimeException("console is not present");
        }
    }
}