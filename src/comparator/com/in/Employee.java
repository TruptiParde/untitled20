package comparator.com.in;

public class Employee {
     private String name;
     private String lastname;
     private int id;
     private int age;

     public Employee(String name,String lastname,int id,int age){
         this.name=name;
         this.lastname=lastname;
         this.id=id;
         this.age=age;
     }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
