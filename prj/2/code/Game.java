import java.util.Scanner;

/**
 * The class creates and maintains the state of the crazy eights game.
 */
public class Game {

   /**
    * The player 1.
    */
   private Player player1;

   /**
    * The player 2.
    */
   private Player player2;

   /**
    * The draw pile (stock).
    */
   private Pile drawPile;

   /**
    * The discard pile (waste).
    */
   private Pile discardPile;

   /**
    * The input.
    */
   private Scanner input;

   /**
    * Instantiates a new game.
    * <p>
    * Note: this constructor creates two computer players.
    * This is useful for a demo.
    * </p>
    */
   public Game() {
      player2 = new Computer("player2");
      player1 = new Computer("player1");
      input = new Scanner(System.in);
      initializeGame();
   }

   /**
    * Instantiates a new game.
    * <p>
    * Note: this constructor creates one computer players.
    * and one human player (user).
    * This is useful for a 1-player game.
    * </p>
    *
    * @param name the name of the human player (user)
    */
   public Game(String name) {
      player1 = new User(name);
      player2 = new Computer("Computer");
      input = new Scanner(System.in);
      initializeGame();
   }


   /**
    * Initializes the state of the game.
    */
   private void initializeGame() {
      // Create and shuffle a pack (full deck)
      Deck pack = new Deck();
      pack.shuffle();

      // Deal cards to each player
      int handSize = 8;
      pack.deal(player1.getHand(), handSize);
      pack.deal(player2.getHand(), handSize);

      // Turn one card face up
      discardPile = new Pile("Discards");
      pack.deal(discardPile, 1);

      // put the rest of the deck face down
      drawPile = new Pile("Draw pile");
      pack.dealAll(drawPile);
   }


   /**
    * Draw: deal one card face up from draw pile.
    * <p>
    * Note: If the draw pile ever runs out, the discard pile is shuffled
    * (except the top card) and becomes the new draw pile.
    * </p>
    *
    * @return a card from the draw pile.
    */
   public Card draw() {
      if (drawPile.empty()) {
         reshuffle();
      }
      return drawPile.popCard();
   }

   /**
    * Moves cards from the discard pile to the draw pile and shuffles.
    * <p>
    * Note: this is done if the draw pile ever runs out.
    * </p>
    */
   private void reshuffle() {
      // save the top card
      Card prev = discardPile.popCard();

      // move the rest of the cards
      discardPile.dealAll(drawPile);

      // put the top card back
      discardPile.addCard(prev);

      // shuffle the draw pile
      drawPile.shuffle();
   }

   /**
    * Switches players.
    *
    * @param current the current player
    * @return the next player
    */
   private Player nextPlayer(Player current) {
      if (current == player1) {
         return player2;
      } else {
         return player1;
      }
   }

   /**
    * Displays the state of the game.
    */
   private void displayState() {
      player1.display();
      player2.display();
      System.out.println(">>> Last played (discarded): " + discardPile.last());
      System.out.print(">>> Total discarded: ");
      System.out.println(discardPile.size() + " cards");
      System.out.print(">>> Total in Draw pile: ");
      System.out.println(drawPile.size() + " cards");
   }

   /**
    * Player takes a turn.
    *
    * @param player the player who should play now.
    */
   private void takeTurn(Player player) {
      Card prev = discardPile.last();
      System.out.println("-----------------------------------");
      System.out.println("\t" + player.getName() + "'s turn!");
      System.out.println("-----------------------------------");
      Card next = player.play(this, prev);
      discardPile.addCard(next);

      System.out.println("\n*** " + player.getName() + " plays " + next + "\n");
      System.out.println();
   }

   /**
    * Play the game.
    */
   public void playGame() {
      Player player = player1;

      // keep playing until there's a winner
      while (!isDone()) {
         displayState();
         takeTurn(player);
         player = nextPlayer(player);
         waitForUser();
      }

      // display the final score
      player1.displayScore();
      player2.displayScore();

      // display the winner
      if (player1.score() > player2.score()) {
         System.out.println(player2.name + " wins!");
      } else if (player1.score() == player2.score()) {
         System.out.println("I call it a draw!");
      } else {
         System.out.println(player1.name + " wins!");
      }
   }
   /**
    * Checks if game is done.
    *
    * @return true,  if either player's hand is empty.
    */
   private boolean isDone() {
      return player1.getHand().empty() || player2.getHand().empty();
   }

   /**
    * Waits for the user to press enter.
    */
   private void waitForUser() {
      System.out.println(">>> Press Enter to continue! >>>\n");
      input.nextLine();
   }
}