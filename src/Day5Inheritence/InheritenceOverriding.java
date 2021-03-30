package Day5Inheritence;

class abcd{
    int x=10;

    void show(){
        System.out.println("parent show");
    }
}

class defg extends abcd{
    int x=15;

    @Override
    void show(){
        System.out.println("child show");
    }
}

public class InheritenceOverriding {

    public static void main(String[] args) {
        defg ob=new defg();
        ob.show();
    }
}

