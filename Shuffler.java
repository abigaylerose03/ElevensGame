import java.util.*;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) 
	{
        	int[] firstHalf = new int[values.length/2];
        	int[] secHalf = new int[(int)((double)values.length/2 + 0.5)];
        	for (int i = 0; i < firstHalf.length; i++)
        	{
        	    firstHalf[i] = values[i];
        	}
        	for (int i = firstHalf.length; i < values.length; i++)
        	{
        	    secHalf[i - firstHalf.length] = values[i];
        	}
        	int[] temp = new int[values.length];
        	for (int i = 0; i < values.length; i++)
        	{
        	    if (i % 2 == 0)
        	    {
        	        temp[i] = secHalf[i/2];
        	    }
        	    else
        	    {
        	        temp[i] = firstHalf[i/2];
        	    }
        	}
        	values = temp;
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	
	// The Randomizer method defined by CodeHS that uses Java's Randomizer class
c static void efficientSelectionShuffle(int[] deck)
	{
		for(int k = deck.length; k >= 1; k--)
		{
			Random ran = new Random();
			int r = ran.nextInt(k);
			int temp = deck[r];
			deck[r] = deck[k];
			deck[k] = temp;
		}
	
	}
	
	public static void selectionShuffle(int[] values) {
		ArrayList<Integer> valuesList = new ArrayList<Integer>(); 
		for(int i = 0; i < values.length; i++)
		{
		    
		}
	}
}
