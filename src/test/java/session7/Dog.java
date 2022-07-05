package session7;

public class Dog extends DogBranch{

    public Dog () {
        super();
        setDomesticated(true);
    }

    public Dog (String name) {
        super(name);
        setDomesticated(true);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof-woof");
    }

    public void protectArea () {
        System.out.println("Dog is protecting the area");
    }

}
