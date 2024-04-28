package QuattroGame;

// author Adam McHugh
public class ColourCard extends Card { // main class

    String cardColour;

    ColourCard(int cardCode, String cardColour) { // constructor
        super(cardCode); // call superclass constructor
        this.cardColour = cardColour;
    }

    public String getCardColour() { // get method
        return cardColour;
    }

    @Override
    public String getString() { // get method
        return cardColour;
    }

}
