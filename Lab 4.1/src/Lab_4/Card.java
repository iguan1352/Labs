package Lab_4;

public class Card {
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue) 
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}

	public String getRank()
	{
		return this.rank;
	}
	
	public String getSuit()
	{
		return this.suit;
	}
	
	public int getValue()
	{
		return this.pointValue;
	}
	public String toString()
	{
		return "[" + rank + ", "+ suit + ", "  + pointValue + "]";
	}
}
