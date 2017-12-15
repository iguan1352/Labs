import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public Deck(String[] rank, String[] suit, int[] pointValue) 
	{
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				Card newCard = new Card(rank[i], suit[j], pointValue[i]);
				unDealt.add(newCard);
			}
		}
	}
	
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}

	public ArrayList<Card> size()
	{
		return unDealt;
	}
	
	public Card deal()
	{
		Card aCard = unDealt.get(0);
		if(unDealt.size() == 0)
		{
			return null;
		}
		else
		{
			Dealt.add(unDealt.remove(0));
			unDealt.remove(0);
		}
		return aCard;
	}
	
	public void shuffle()
	{
		int r = (int)(Math.random() * 51) + 1;
		for(int k = )
	}
}
