package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class MainBird {

    /*

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {

        BirdOwner sjakie = new BirdOwner("Sjakie", "M");
        Bird tweety = new Bird("Tweety", "Canari", 34234 );
        Bird pietje = new Bird("Pietje", "M", 87987987);
        List<Bird> birdList = new ArrayList<>();
        birdList.add(tweety);
        sjakie.setBirds(birdList);
        System.out.println(sjakie.getBirds().get(0).getNickname());
        sjakie.addBirdToList(pietje);
        System.out.println(sjakie.getBirds().get(1).getNickname());


    }

}
