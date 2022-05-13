package comparator.com.in;
//employee list sorting by name,lastname,id,age using comparator and lambda expression
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyComparator {
    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Mahendra","Dhoni", 101,42));
        emp.add(new Employee("Gautam","Gambhir", 104,40));
        emp.add(new Employee("Virat","Kohli", 111,32));
        emp.add(new Employee("Ravindra","Jadeja", 107,35));
        emp.add(new Employee("Sachin","Tendulkar", 131,44));


        emp.sort(Comparator.comparing(e -> e.getName()));
        System.out.println(emp);
        emp.sort(Comparator.comparing(e-> e.getAge()));
        System.out.println(emp);
        emp.sort(Comparator.comparing(e -> e.getId()));
        System.out.println(emp);
        emp.sort(Comparator.comparing(e->e.getLastname()));
        System.out.println(emp);
    }



}
