package Day4;


//Another example for Encapsulation
class Student {
    int rollNo;
    String name;

    public int getRollNo() {
        System.out.println("The value of Roll No is being accessed:" + rollNo);
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("The value of Roll No has changed");
    }

    public String getName() {
        System.out.println("The value of Name is being accessed:" + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The value of Name has changed");
    }
}

public class Test {
    public static void main (String[] args) {
        Student studentObj = new Student();
        studentObj.setRollNo(20);
        studentObj.getRollNo();
        studentObj.setName("John Smith");
        studentObj.getName();

    }
}
