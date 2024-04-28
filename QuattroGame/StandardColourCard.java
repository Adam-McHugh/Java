package QuattroGame;

// author Adam McHugh
public class StandardColourCard extends ColourCard { // main class

    int cardNumber;

    StandardColourCard(int cardCode, String cardColour, int cardNumber) { // constructor
        super(cardCode, cardColour);
        this.cardNumber = cardNumber;

    }

    public int getCardNumber() { // get method
        return cardNumber;
    }

    public void CreateColourCardsRed(String Red) { // method create coloured cards and number 0-9
        String cardColour = Red;
        for (int i = 0; i < 10; i++) {
            cardNumber = cardNumber + 1;
            StandardColourCard sccr = new StandardColourCard(cardNumber, cardColour, i);

        }
    }

    public void CreateColourCardsGreen(String Green) { // method create coloured cards and number 0-9
        String cardColour = Green;
        for (int i = 0; i < 10; i++) {
            cardNumber = cardNumber + 1;
            StandardColourCard sccg = new StandardColourCard(cardNumber, cardColour, i);

        }
    }

    public void CreateColourCardsBlue(String Blue) { // method create coloured cards and number 0-9
        String cardColour = Blue;
        for (int i = 0; i < 10; i++) {
            cardNumber = cardNumber + 1;
            StandardColourCard sccb = new StandardColourCard(cardNumber, cardColour, i);

        }
    }

    public void CreateColourCardsYellow(String Yellow) { // method create coloured cards and number 0-9
        String cardColour = Yellow;
        for (int i = 0; i < 10; i++) {
            cardNumber = cardNumber + 1;
            StandardColourCard sccy = new StandardColourCard(cardNumber, cardColour, i);

        }
    }

    @Override
    public String getString() {

        return null;

    }
}
