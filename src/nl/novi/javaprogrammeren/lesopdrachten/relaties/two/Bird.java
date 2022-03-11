package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {
//    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
//    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

//    Variables

    private String nickname;
    private String species;
    private int ringNumber;

//    Constructors

    public Bird(String nickname, String species, int ringNumber) {
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
    }

//    Getters

    public String getNickname() {
        return nickname;
    }

    public String getSpecies() {
        return species;
    }

    public int getRingNumber() {
        return ringNumber;
    }

//    Setters

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

//    Methodes
@Override
public String toString() {
    return this.getNickname() + " with number: " + this.getRingNumber();
}

}
