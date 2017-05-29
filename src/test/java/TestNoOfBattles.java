import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 */

/**
 * @author mariachowdhury
 *
 */
public class TestNoOfBattles {

	@Test
	public void test() {
		ArrayList<Transformer> transformerList = new ArrayList<Transformer>();
		transformerList.add(new Transformer("Hubcap", 'A', 4, 4, 4, 4, 4, 4, 4,
				4));
		transformerList.add(new Transformer("Soundwave", 'D', 8, 9, 2, 6, 7, 5,
				6, 10));
		transformerList.add(new Transformer("Bluestreak", 'A', 6, 6, 7, 9, 5,
				2, 9, 7));
		Battle battle = new Battle();
		ArrayList<Transformer> transformers = battle
				.getSortedList(transformerList);
		ListAndNoOfBattle lanob=battle.collectList(transformers);
		int x = battle.getNumberOfBattles(lanob);
		assertEquals(1, x);
	}

}
