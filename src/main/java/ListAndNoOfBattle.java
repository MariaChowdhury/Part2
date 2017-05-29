import java.util.ArrayList;

/**
 * This class is to contain the list of Transformers and number of battles
 */

/**
 * @author mariachowdhury
 *
 */
public class ListAndNoOfBattle {
	ArrayList<Transformer> list;
	int numberOfBattles;

	public ListAndNoOfBattle(ArrayList<Transformer> list, int numberOfBattles) {
		this.list = list;
		this.numberOfBattles = numberOfBattles;
	}

	public ArrayList<Transformer> getList() {
		return list;
	}

	public int getNumberOfBattles() {
		return numberOfBattles;
	}

}
