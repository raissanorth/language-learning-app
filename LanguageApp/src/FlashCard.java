
public class FlashCard {
	Integer rank;
	String word;
	String description;
	String grammar;

	public FlashCard(Integer r, String w, String d, String g) {
		this.rank = r;
		this.word = w;
		this.description = d;
		this.grammar = g;
	}

	public Integer getRank() {
		return rank;
	}

	public String getWord() {
		return word;
	}

	public String getDescription() {
		return description;
	}

	public String getGrammar() {
		return grammar;
	}


}
