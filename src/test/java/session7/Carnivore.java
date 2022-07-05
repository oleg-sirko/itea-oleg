package session7;

public class Carnivore extends Animal{

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore() {
        super();
    }

    @Override
    public Object eatsMeat() {
        return true;
    }
}
