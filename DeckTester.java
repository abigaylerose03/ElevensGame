/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck deck1 = new Deck(new String[]{"a","b"},new String[]{"YES","NO","PERHAPS"},new int[]{1,2});
		System.out.println(deck1.toString() + "\n" + deck1.deal().toString() + "\n" + deck1.toString());
	}
}
