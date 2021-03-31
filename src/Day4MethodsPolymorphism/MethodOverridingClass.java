package Day4MethodsPolymorphism;

public class MethodOverridingClass {
    public static void main(String[] args){
        Animal animal=new Animal();
        Dog dog=new Dog();
        Lion lion=new Lion();
        animal.animalVoice();
        dog.animalVoice();
        lion.animalVoice();
        Animal dog1=new Dog();
        Animal lion1= new Lion();
        dog1.animalVoice();
        lion1.animalVoice();
    }
}
