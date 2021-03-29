package Day4;

class Employee {
    protected int empID2;
    private int empID = 101;
    private int start_empID = 100;
    private int end_empID = 999;

    // setter method
    public void setEmpID(int eid) {
        // User login
        checkUser();

        //Conditions
        if ((eid < 100) || (eid > 999)) {
            System.out.println("Value of emp id should be between 100 and 999. Enter valid emp ID!!");
            empID = 0;
        } else{
            empID = eid;

            //Logs
            System.out.println("Value of EmpID is being changed");
        }
    }

    //getter method
    public int getEmpID() {
        return empID;
    }

    public void checkUser(){
        // check the login
    }


}

public class EncapsulationDemo {
    public static void main (String[] args) {
        Employee emp = new Employee();
       // emp.empID = 200;

        emp.setEmpID(200);
        System.out.println(emp.getEmpID());

        emp.setEmpID(10);
        System.out.println(emp.getEmpID());
    }
}
