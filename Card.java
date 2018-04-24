public class Card {
	// class variables
	public static final String[] RANKS = {
		null, "Ace", "2", "3", "4", "5", "6",
		"7", "8", "9", "10", "Jack", "Queen", "King"
	};

	public static final String[] SUITS = {
		"Clubs", "Diamonds", "Hearts", "Spades"
	};

	// cards are immutable but still can assign values in contructor 
	private final int rank;
	private final int suit;

	// constructor
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	// getters
	public int getRank() {
		return this.rank;
	}

	public int getSuit() {
		return this.suit;
	}

	// useful for debugging
	public String toString() {
		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String s = ranks[this.rank] + " of " + suits[this.suit];
		return s;
	}

	public static void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			// equivalent to System.out.println(Arrays.toString(cards))
			System.out.println(cards[i]);
		}
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

	// sequential search
	public static int sequentialSearch(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	// binary search
	public static int binarySearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;
		while (low <= high) {
			System.out.println(low + ", " + high);
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			if (comp == 0) {
				return mid;
			} else if (comp < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	// recursive binary search

	public static void main(String[] args) {
		// create new deck = array of cards
		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		Card target_card = new Card(11, 1);
		int output = binarySearch(cards, target_card);
		System.out.println(output);
	}
}
