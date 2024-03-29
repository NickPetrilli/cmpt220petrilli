
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

/**
 * This class represents a standard deck (52 playing cards).
 */
public class Deck extends CardArray {

   /**
    * Instantiates a new deck.
    * Generate the 52 standard playing card.
    */
   public Deck() {
       
      for (int s = 1; s <= 4; s++) { // iterates through each suit
         for (int r = 1; r <= 13; r++) { // iterates through each rank
            addCard(new Card(r, s));      
         }
      }  
   }

   /**
    * Shuffle: randomly permute the cards.
    */
   public void shuffle() {
      List<Card> l = Arrays.asList(Arrays.copyOf(this.cards, this.numFilled));
      Collections.shuffle(l);
      this.cards = Arrays.copyOf(l.toArray(new Card[0]), 52);
   }

   /**
    * Deal: To distribute cards to players.
    *
    * @param hand the cards held by one player
    * @param n number of cards to move from deck to the given hand.
    */
   public void deal(CardArray hand, int n) {
      for (int i = 0; i < n; i++) {
         hand.addCard(popCard());
      }
   }

   /**
    * Deal all: take all the cards out of the deck and add 
    * to the pile.
    *
    * @param pile a set of cards that acts as Waste or Stock.
    */
   public void dealAll(CardArray pile) {
      int n = size();
      deal(pile, n);
   }


   /* Returns a string representation of the Deck.  */
   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Deck: ");
      for (int i = 0; i < this.numFilled; i++) {
         sb.append(cards[i].toString() + "\n");
      }
      return sb.toString();
   }
}
