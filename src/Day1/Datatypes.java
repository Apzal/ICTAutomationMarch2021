package Day1;

public class Datatypes {

    public static void main(String[] args) {

        int age = 50;
        String name = "Irshad";
        boolean isLearning= true;

        Student student1= new Student();
        System.out.println(student1.present);
        student1.attendence();
        System.out.println(student1.present);

        //widening
        int a= 10;
        float b= a;
        System.out.println(b);

        float c= 20.3f; //f or F
        double d= 30.5d; //d or D

        //narrowing
        int x= (int)c;
        System.out.println(x);
    }
}
