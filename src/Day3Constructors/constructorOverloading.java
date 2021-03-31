package Day3Constructors;

//Java program to overload constructors
class Student5{
    public int id;
    private String name;
    protected int age ;
    String gender ;

    Student5(){
        id = 0;
        name = null;
        age = 0;
    }
    //creating two arg constructor
    Student5(int i,String n){
        id = i;
        name = n;
    }
    Student5(String n, int id1){
        id = id1;
        name = n;
    }
    //creating three arg constructor
    Student5(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        Student5 s1 = new Student5(0,null);
        Student5 s5 = new Student5(2,"sdf");
        Student5 s2 = new Student5(222,"Aryan",25);
        Student5 s3 = new Student5("Aryan", 222);
        s1.display();
        s2.display();
        s3.display();
    }
}