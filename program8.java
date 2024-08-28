import java.time.LocalDate;
import java.util.Date;



public  class program8{
    public static void main(String[] args) {
        Date d = new Date();
        System.out.print(d);
        System.out.println("\n");
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
}