package session7;

public class Tiger extends DogBranch{

    public Tiger() {
        super();
        setDomesticated(false);
    }

    public Tiger(String name) {
        super(name);
        setDomesticated(false);
    }

    @Override
    public void makeNoise() {
        System.out.println("Roaarrrr");
    }

}
