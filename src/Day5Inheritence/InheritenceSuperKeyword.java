package Day5Inheritence;


//accessing parent constructor, members through super keyword

class abc {
    int a;

    public abc() {
        System.out.println("Parent constructor called");
    }

    public void show(){
        System.out.println("parent method");
    }
}

class def extends abc {

    public def() {
        super(); //default is super() even if not specified... and should be first in the constuctor body of child class
        System.out.println("Child constructor called");
        super.a = 20;
        super.show();
    }

}

public class InheritenceSuperKeyword {

    public static void main(String[] args) {

        def ob = new def();

    }
}
