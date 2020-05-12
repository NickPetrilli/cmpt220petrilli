public final class Card {
   private final int rank; 
   private final int suit; 
   
   public Card(int rank, int suit) { 
      this.rank = rank; 
      this.suit = suit; 
   }
   
   public int getRank() { 
      return rank; 
   }
   /**
   * Returns the suit instance field.
   * @return the suit instance field
   */  
   public int getSuit() { 
      return suit; 
   }
   @Override
   public String toString() {
      String r = stringRank();
      String s = stringSuit();
      
      return r + " of " + s;
   }
   @Override
   public boolean equals(Object other) {
      // False if the other Object is not a Card
      if (!(other instanceof Card)) {
         return false;
      }
      // Check to see if the addresses are the same (same object)
      if (this == other) {
         return true;
      }
      // Cast other object as a Card
      Card otherCard = (Card) other;
      // Compare the fields of otherCard w/ fields of implicit object
      return this.rank == otherCard.getRank() &&
             this.suit == otherCard.getSuit();
   }
   /**
   * Compares this Card with the specified otherCard for order.
   * @param otherCard the other Card object to be compared.
   * @return a negative integer, zero, or a positive integer as
   * this object is less than, equal to, or greater than the otherCard.
   */
   public int compareTo(Card otherCard) {
      // Suit takes precedence in the deck order
      int compareSuit = this.suit - otherCard.getSuit();
      // checks if the suits are not the same
      if (compareSuit != 0) {
         return compareSuit; } // returns a (+) or (-) integer
         
      // If suits are the same, returns the difference of ranks
      int compareRank = this.rank - otherCard.getRank();
      return compareRank; // returns 0 if the same, (+) or (-) otherwise
   }   
   /**
   * Maps the rank variable into human language.
   * @return a String representation of rank
   */  
   private String stringRank() {
      switch (rank) {
         case 1:
            return "Ace";
         case 2:
            return "2";
         case 3:
            return "3";
         case 4:
            return "4";
         case 5:
            return "5";
         case 6:
            return "6";
         case 7:
            return "7";
         case 8:
            return "8";
         case 9:
            return "9";
         case 10:
            return "10";
         case 11:
            return "Jack";
         case 12:
            return "Queen";
         case 13:
            return "King";
         default:
            return null;
      }
   }
   /**
   * Maps the suit variable into human language.
   * @return a String representation of suit
   */     
   private String stringSuit() {
      switch (suit) {
         case 1:
            return "Clubs";
         case 2:
            return "Diamonds";
         case 3:
            return "Hearts";
         case 4:
            return "Spades";
         default:
            return null;
      }   
   }
} 