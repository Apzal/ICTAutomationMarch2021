package Day4MethodsPolymorphism;

public class Cat extends AbstractAnimal{
    public void animalSound(){
       System.out.println("test abstract method");
    }
    public static void main(String[] args){
        Cat cat=new Cat();
        cat.animalSound();
        cat.displayAnimal();
    }
}
