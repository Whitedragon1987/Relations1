package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Animal {

    private String name;
    private String shelter;
    private String sex;
    private String lastFed;
    private String origin;

    public Animal(String name, String shelter, String sex, String lastFed, String origin) {
        this.name = name;
        this.shelter = shelter;
        this.sex = sex;
        this.lastFed = lastFed;
        this.origin = origin;
    }

    // methode afmaken pet moves 0.25, other moves 0.50
    public void moves(){
    }

    public void sleep(){
        System.out.println("sleeps 8 hours a day");
    }

    public void sound(String sound){
        System.out.println(sound);
    }

    public void eats(String food){
        System.out.println(food);
    }

//    Getters & Setters
    public String getName() {
        return name;
    }

    public String getShelter() {
        return shelter;
    }

    public String getSex() {
        return sex;
    }

    public String getLastFed() {
        return lastFed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShelter(String shelter) {
        this.shelter = shelter;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
