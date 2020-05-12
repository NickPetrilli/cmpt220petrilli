/**
 * This abstract class encapsulates
 * an array of playing cards.
 */
public abstract class CardArray {

   protected Card[] cards;

   protected int numFilled;

   public CardArray() {
      this.cards = new Card[52];
      this.numFilled = 0;
   }

   public void addCard(Card card) {
      cards[numFilled] = card;
      numFilled++;
   }

   public Card popCard() {
      Card last = cards[numFilled - 1];
      numFilled--;
      return last;
   }

   public int size() {
      return this.numFilled;
   }

   public boolean empty() {
      return this.numFilled == 0;
   }

}