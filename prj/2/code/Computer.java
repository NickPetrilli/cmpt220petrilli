/**
 * The class implements player strategy.
 * It can be used to play against computer.
 */
public class Computer extends Player {

   /**
    * Instantiates a new player.
    *
    * @param name the name of the player.
    */
   public Computer(String name) {
      super(name);
   }

   /**
    * Computer plays a Card from its hand.
    * @param crazyEight gives access to the "draw pile".
    * @param prev the previously played card.
    * @return the Card played by the Computer.
    */
   public Card play(Game crazyEight, Card prev) {
      Card card = searchForMatch(prev);
      if (card == null) {
         card = drawForMatch(crazyEight, prev);
      }
      return card;
   }

   /**
    * Searches the player's hand for a matching card.
    * <p>
    * returns null if no match found.
    * </p>
    *
    * @param prev the previously played card.
    * @return a card from the player's hand.
    */
   private Card searchForMatch(Card prev) {
      for (int i = 0; i < hand.size(); i++) {
         Card card = hand.getCard(i);
         if (cardMatches(card, prev)) {
            return hand.popCard(i);
         }
      }
      return null;
   }

   /**
    * Draw cards from "draw pile" until a match is found.
    *
    * @param crazyEight gives access to the "draw pile".
    * @param prev the previously played card.
    * @return a card that matches prev.
    */
   private Card drawForMatch(Game crazyEight, Card prev) {
      while (true) {
         Card card = crazyEight.draw();
         System.out.println("\n*** " + name + " draws " + card + "\n");
         if (cardMatches(card, prev)) {
            return card;
         }
         hand.addCard(card);
      }
   }


}