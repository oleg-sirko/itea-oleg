package session7;

public class Animal {
    private String name;
    private boolean domesticated;


    public Animal(){}

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, boolean domesticated){
        this.name = name;
        this.domesticated = domesticated;
    }
    
    public void makeNoise () {}
    
    public Object eatsMeat () {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    public String getName() {
        return name;
    }

    public boolean isDomesticated() {
        return domesticated;
    }
}
