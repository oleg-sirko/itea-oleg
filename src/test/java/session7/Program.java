package session7;

public class Program {


    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Tiger namelessTiger = new Tiger();
        Dog jackTheDog = new Dog("Jack");

        System.out.println("Tiger says:");
        namelessTiger.makeNoise();

        System.out.println("\nDog says:");
        jackTheDog.makeNoise();

        System.out.println("\nUnknown animal says:");
        someAnimal.makeNoise();


    }
}
