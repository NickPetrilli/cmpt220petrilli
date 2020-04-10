
public class Deck {
	private Card[] cards;
	private final String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public Deck() {
		cards = new Card[52];
		int x = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[x++] = new Card(faces[j], suits[i]);
			}
		}
	}
	public void displayCards() {
		for (int i = 0; i < cards.length; i++)
			System.out.println(cards[i]);
	}

}
