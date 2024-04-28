package QuattroGame;

// @author Adam McHugh
public class SpecialColourCard extends ColourCard implements SpecialAbility { // main class with inheritance

    String specialAbility;

    SpecialColourCard(int cardCode, String cardColour, String specialAbility) { // constructor
        super(cardCode, cardColour);
        this.specialAbility = specialAbility;
    }

    @Override
    public void activateAbility() {

    }

}
