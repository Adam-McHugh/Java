

import java.io.IOException;
import java.util.ArrayList; // imported libraries required
import java.util.Collections;
import java.util.Scanner;

// author Adam McHugh
public class QuattroGame { // main class

    ArrayList<Card> cardListStack; // main stack middle of board 
    ArrayList<Card> cardListDraw;
    ArrayList<Card> cardListDiscard;
    ArrayList<Player> playerList; // players list in game
    ArrayList<Player> playerHand; // players usable cards to choose from
    ArrayList<Player> computerHand; // PC usable cards to choose from
    int numberOfPlayer = 4; // Four player game 
    int startingCardNumber = 3; // starting number of cards
    int cardCodeSeed = 0;
    int choiceIndex; // Index of chosen card for both player and computer
    int win; // 0 - no result; 1 - win; -1 - loss. 

    public void playGame() { // method to call all other methods needed for game 

        while (true) {
            createCards();
            createPlayers();
            playerHand.clear();
            computerHand.clear();
            win = 0;
            dealCards();
            System.out.println("\n Welcome to Quattro Game!");
            playFirstCard();
        }
    }
    // Methods

    private void createCards() { // Creating all cards then shuffling cards 
        cardListStack.add(sccr);
        cardListStack.add(sccg);
        cardListStack.add(sccb);
        cardListStack.add(sccy);
        Collections.shuffle(cardListStack);

    }

    private void createPlayers() throws IOException { // player creation method
        try {
            Scanner keyboard = new Scanner(System.in);
            ArrayList<Card> playerList = new ArrayList<Card>();
            if (true) {
                System.out.println("Please enter your Name.");
                while (keyboard.next()) {
                    playerList.add(0, keyboard); // human player added to array index 0
                }
                keyboard.close();
                else {
                    playerList.add(1, Computer1); // added to index 1
                    playerList.add(2, Computer2);
                    playerList.add(3, Computer3); 
                    }
            }
        } catch (IOException n) { // error message if invalid name entered
            System.out.println(getMessage());
        }
    }

    private void dealCards() {
        for (int i = 0; i <= numberOfPlayer; i++) { //Each player to recieve defined number of starting cards
            cardListStack.remove(startingCardNumber);
            playerHand.add(startingCardNumber); // trying to add to player and computers decks
            computerHand.add(startingCardNumber);
        }
    }

    private void playFirstCard() {
        // PLAYERS TURN
        for (boolean isHuman = true; win == 0;) {
            choiceIndex = 0;
            System.out.println("\n The top card is: " + cardListStack.toString()); // show the Face of the top card on Deck

            if (isHuman) {
                // Displaying user's deck
                System.out.println("Your turn!");
                for (int i = 0; i < playerHand.size(); i++) {
                    System.out.print(String.valueOf(i) + ". " + "\n");
                    // trying to list players hand on screen. To make decisions from I.E 1. Red 3, 2. green 9

                }

                do { // players choice of input for listed cards to be played
                    Scanner input = new Scanner(System.in);
                    System.out.print("\n Please input the number of your choice: ");
                    input = new Scanner(System.in);
                } while (input.hasNextInt());

                choiceIndex = input.nextInt();

                // PLAYERS ACTION INTERGRATION
                if (choiceIndex == playerHand.size()) {
                    playerHand.remove(0);
                } else if (choiceIndex == playerHand.size() + 1) {
                    break playGame;
                } else if (((ArrayList<Card>) playerHand.get(choiceIndex)).canPlace(cardListDiscard)) {
                    cardListDiscard = (ArrayList<Card>) playerHand.get(choiceIndex);
                    playerHand.remove(choiceIndex);

                }

            }
        }
        // COMPUTERS TURN
        for (boolean isHuman = false; win == 0;) {
            System.out.println("My turn! I have " + String.valueOf(computerHand.size())
                    + " cards left!" + ((computerHand.size() == 1) ? "I WIN" : ""));

            // Finding a card to place
            for (choiceIndex = 0; choiceIndex < computerHand.size(); choiceIndex++) {
                if ((computerHand.get(choiceIndex)).canPlace(cardListDiscard,)) // Searching for playable cards
                {
                    break;
                }
            }

            if (choiceIndex == computerHand.size()) {
                System.out.println("I've got nothing! Drawing cards...");
                computerHand.remove(0);
            } else {
                cardListStack = (computerHand.get(choiceIndex));
                computerHand.remove(choiceIndex);

                System.out.println("I choose " + cardListStack.toString() + " !");

            }

        }

        /**
         * ***********Results*************
         */
        if (win == 1) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

        System.out.println("Thank you for playing");
    }

    private String getMessage() {
        return "Invalid name input. Enter only a-z characters. NO numbers or special characters";
    }
}
