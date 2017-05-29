import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Any Transformer named Optimus Prime or Predaking wins his fight automatically regardless of
	any other criteria
 */

/**
 * @author mariachowdhury
 *
 */
public class BattleSpecialRuleTest {

	@Test
	public void test() {
		ArrayList<Transformer> transformerList = new ArrayList<Transformer>();
		transformerList.add(new Transformer("Hubcap", 'A', 4, 4, 4, 4, 4, 4, 4,
				4));
		transformerList.add(new Transformer("Soundwave", 'D', 8, 9, 2, 6, 7, 5,
				6, 10));
		transformerList.add(new Transformer("Bluestreak", 'A', 6, 6, 7, 9, 5,
				2, 9, 7));
		transformerList.add(new Transformer("Optimus Prime", 'A', 6, 6, 7, 9,
				5, 2, 9, 7));
		Battle battle = new Battle();
		ArrayList<Transformer> transformers = battle
				.getSortedList(transformerList);
		String teamname = battle.printSpecialWinner(transformers);
		assertEquals("Optimus Prime", teamname);
	}

}
