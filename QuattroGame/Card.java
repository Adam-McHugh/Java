package QuattroGame;

// author Adam McHugh
abstract class Card { // main card class

    int cardCode;

    Card(int cardCode) { // constructor
        this.cardCode = cardCode;
    }

    // get method
    public int getCardCode() {
        return cardCode;
    }

    public String getString() {
        return null;
    }
}