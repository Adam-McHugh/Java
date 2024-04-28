package QuattroGame;

import java.util.ArrayList;

// author Adam McHugh
// Class 
public class Player {

    // Variables
    String name;
    // ArrayList card objects
    ArrayList<Card> cardList;
    // boolean variable human true or not
    Boolean isHuman = true;

    // constructor
    Player(String name, ArrayList cardList, Boolean isHuman) {
        this.name = name;
        this.cardList = cardList;
        this.isHuman = isHuman;
    }

    // get method
    public String getName() {
        return name;
    }

    // set method
    public void setName(String name) {
        this.name = name;
    }

    // get method
    public boolean getIsHuman() {
        return isHuman;
    }

    // get method
    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public void addCardToHand() {

    }

}
