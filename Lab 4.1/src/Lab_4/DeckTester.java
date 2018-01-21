package Lab_4;

public class DeckTester {

	public static void main(String[] agrs)
	{
		String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suit = {"Spade", "Heart", "Clover", "Diamond"};
		int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck cardDeck = new Deck(rank, suit, pointValue);
		
		cardDeck.shuffle();
		
		for(int i = 0; i < 52; i++)
		{
			System.out.println(cardDeck.deal());
		}
	}
}
