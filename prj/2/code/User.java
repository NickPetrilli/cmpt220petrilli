import java.util.Scanner;

/**
 * This class represents a human player (user) in a game of crazy eights.
 */
public class User extends Player {

   /**
    * To read user's input from keyboard.
    */
   private Scanner input;

   /**
    * Instantiates a human player with an empty hand.
    *
    * @param theName the name of the player
    */
   public User(String theName) {
      super(theName);
      input = new Scanner(System.in);
   }

   /**
    * Allow the user to select a Card from their hand and "play" it.
    * Make sure the think through all the steps involved to play 1
    * round of the game
    * @param crazyEight gives access to the "draw pile".
    * @param prev       the previously played card.
    * @return the card played by the user.
    */
   public Card play(Game crazyEight, Card prev) {
      while (true) {
         System.out.println("Select a card from your hand or " + 
            "enter 0 to draw a new card: ");
         int num = input.nextInt();
         if (num != 0) {
            Card card = hand.getCard(num - 1);
            if (cardMatches(card, prev)) {
               return hand.popCard(num - 1); }
            else {
               System.out.println("\n--- This card is not a match!\n");
            }
         }
         else {
            Card draw = crazyEight.draw();
            hand.addCard(draw);
            System.out.println("\n*** " 
               + name + " draws " + draw + "\n");
            System.out.println(hand.toString());
         }
      }
   }
}