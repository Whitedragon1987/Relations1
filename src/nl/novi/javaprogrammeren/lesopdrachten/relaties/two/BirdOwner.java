package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class BirdOwner {
//    Geef de klasse BirdOwner de volgende instance variables: name, sex.
//    Er zijn geen restricties op getters en setters.

//    Variables
    private String name;
    private String sex;
    private List<Bird> birds;

//    Constructors

    public BirdOwner() {
    }

    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    //    Getter

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public List<Bird> getBirds() {
        return birds;
    }

    //    Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirds(List<Bird> birds) {
        this.birds = birds;
    }

//    Methodes
    public void addBirdToList(Bird bird){
        if(!birds.contains(bird)){
            this.birds.add(bird);
        } else{
            throw new RuntimeException("deze vogel bestaat al in de lijst");
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.getName());
        for(Bird ownedBird : birds) {
            stringBuilder.append("\n"); // New line
            stringBuilder.append(ownedBird.toString()); // We gebruiken de toString uit de Bird-klasse!
        }
        return stringBuilder.toString();
    }

}
