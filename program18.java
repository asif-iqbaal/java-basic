import java.lang.System;

public class program18 {
    public static void main(String[] args) {
        // Print a message indicating the display of the system security interface
        System.out.println("System security interface:");

        // Retrieve and print the system security manager using System.getSecurityManager()
        System.out.println(System.getSecurityManager());
    }
}
