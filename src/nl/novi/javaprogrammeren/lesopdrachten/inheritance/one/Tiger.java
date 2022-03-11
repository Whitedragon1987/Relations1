package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Tiger extends Animal{

    private int stripes;

    public Tiger(String name, String shelter, String sex, String lastFed, String origin, int stripes) {
        super(name, shelter, sex, lastFed, origin);
        this.stripes = stripes;
    }

    public int getStripes() {
        return stripes;
    }

    public void setStripes(int stripes) {
        this.stripes = stripes;
    }
}
