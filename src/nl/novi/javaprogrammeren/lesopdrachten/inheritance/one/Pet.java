package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Pet extends Animal{
    private String nameOwner;
    private String foodBranch;
    private String species;

    public Pet(String name, String shelter, String sex, String lastFed, String origin, String nameOwner, String foodBranch, String species) {
        super(name, shelter, sex, lastFed, origin);
        this.nameOwner = nameOwner;
        this.foodBranch = foodBranch;
        this.species = species;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getFoodBranch() {
        return foodBranch;
    }

    public String getSpecies() {
        return species;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setFoodBranch(String foodBranch) {
        this.foodBranch = foodBranch;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
