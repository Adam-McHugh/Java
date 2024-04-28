package QuattroGame;

// @author Adam McHugh
public class WildCard extends Card implements SpecialAbility { // main class with inheritance

    String specialAbility;

    // constructor
    WildCard(int cardCode, String specialAbility) {
        super(cardCode);
        this.specialAbility = specialAbility;
    }

    // get method
    public String getString() {
        return specialAbility;
    }

    public void activateAbility() {

    }

}

