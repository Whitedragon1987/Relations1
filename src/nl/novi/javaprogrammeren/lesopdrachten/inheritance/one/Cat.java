package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Cat extends Pet {

    private Boolean outsideKitty;

    public Cat(String name, String shelter, String sex, String lastFed, String origin, String nameOwner, String foodBranch, String species, Boolean outsideKitty) {
        super(name, shelter, sex, lastFed, origin, nameOwner, foodBranch, species);
        this.outsideKitty = outsideKitty;
    }

    public Boolean getOutsideKitty() {
        return outsideKitty;
    }

    public void setOutsideKitty(Boolean outsideKitty) {
        this.outsideKitty = outsideKitty;
    }
}
