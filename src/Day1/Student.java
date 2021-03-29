package Day1;

public class Student {

    int rollNumber=1;   //instance variable
    static String className="Ten";  //static variable
    String present="no";

    public void attendence(){
        String present="yes"; //local variable
        this.present="hello";
        System.out.println(rollNumber);
    }

}
