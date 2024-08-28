import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("area of circle : C");
        System.out.println("area of rectangle : R");
        System.out.println("area of square : S");
        System.out.println("area of triangle : T");
        
        Scanner C = new Scanner(System.in);
        String s = C.nextLine();
        s = s.toLowerCase();

        switch(s) {
            case "c":
                System.out.println("Enter radius:");
                float radius = C.nextFloat();
                System.out.println("Area of circle: " + (radius * radius * 3.14) + " sq unit");
                break;

            case "r":
                System.out.println("Enter length and breadth:");
                int l = C.nextInt();
                int b = C.nextInt();
                System.out.println("Area of rectangle: " + (l * b) + " sq unit");
                break;

            case "s":
                System.out.println("enter side of the square");
                int side = C.nextInt();
                System.out.println(side*side+"sq unit");
                break;
            
            case "t":
                System.out.println("enter base and height");
                float base = C.nextFloat();
                float height = C.nextFloat();
                System.out.println((base*height)/2+"sq unit");

            default:
                System.out.println("Invalid option!");
        }

        C.close();
    }
}
