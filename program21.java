


class Employee{
    int sal;
    String name;
    public int getSalary(){
        return sal;
    }
    public String getName(){
        return name;
    }
    public void  changeName(String s){
        name = s;
       
    }
}

public class program21{

    public static void main(String[] args){
            System.out.println("my class ");
            Employee e1 = new Employee();
            e1.name = "shami";
            e1.sal = 1600;
            System.out.println(e1.getName());
            System.out.println(e1.getSalary());
            e1.changeName("asif");
            System.out.println(e1.getName());
    }
}