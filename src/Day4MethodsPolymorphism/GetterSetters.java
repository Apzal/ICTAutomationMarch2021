package Day4MethodsPolymorphism;

public class GetterSetters {
    public static void main(String[] args)
    {
        Employee emp =new Employee();
        emp.setAge(35);
        emp.setName("dora");
        emp.displayName();
        emp.calculateYearsOfRetirement();
    }
}

class Employee{
    private int age;
    private String name;

    int getAge()
    {
        return age;
    }
    void setAge(int age)
    {
        this.age=age;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    void displayName(){
        System.out.println("My name is " + name);
    }

    void calculateYearsOfRetirement() {
        if (age < 60) {
            System.out.println(60 - age);
        } else {
            System.out.println("Already retired");
        }
    }

}
