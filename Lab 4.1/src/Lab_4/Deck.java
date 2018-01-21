package Lab_4;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
	public Deck(String[] rank, String[] suit, int[] pointValue) 
	{
		for (int i = 0; i < suit.length; i++)
		{
			for (int j = 0; j < rank.length; j++)
			{
				unDealt.add(new Card(rank[j], suit[i], pointValue[j]));
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

	public int size()
	{
		return unDealt.size();
	}
	
	public Card deal()
	{
		if(unDealt.size() != 0)
		{
			Card aCard = unDealt.get(0);
			unDealt.remove(aCard);
			Dealt.add(aCard);
			return aCard;
		}
		else
		{
			return null;
		}
	}
	
	public void shuffle()
	{
		unDealt.addAll(Dealt);
		Dealt.clear();
		
		for(int k = 51; k > 0; k--)
		{
			int r = (int)(Math.random() * k);
			Collections.swap(unDealt,k,r);
		}
	}
}
