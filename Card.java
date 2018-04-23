public class Card {
	// class variables
	public static final String[] RANKS = {
		null, "Ace", "2", "3", "4", "5", "6",
		"7", "8", "9", "10", "Jack", "Queen", "King"
	};

	public static final String[] SUITS = {
		"Clubs", "Diamonds", "Hearts", "Spades"
	};

	private final int rank;
	private final int suit;

	// constructor
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	// useful for debugging
	public String toString() {
		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String s = ranks[this.rank] + " of " + suits[this.suit];
		return s;
	}

	// comparison methods
	public boolean equals(Card that) {
		return this.rank == that.rank
		&& this.suit == that.suit;
	}

	// abitrary decision to prioritize suit
	public int compareTo(Card that) {
		if (this.suit < that.suit) {
			return -1;
		}
		if (this.suit > that.suit) {
			return 1;
		}
		if (this.rank < that.rank) {
			return -1;
		}
		if (this.rank > that.rank) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Card card = new Card(11, 1);
		System.out.println(card);
	}
}
