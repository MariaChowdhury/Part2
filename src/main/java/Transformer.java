import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */

/**
 * This class is to create a new Transformer and adding them to a list sorted by
 * rank
 * 
 * @author mariachowdhury
 *
 */
public class Transformer implements Comparable<Transformer> {
	String name;
	char type;
	int strength;
	int intelligence;
	int speed;
	int endurance;
	int rank;
	int courage;
	int firepower;
	int skill;
	int overallRating = strength + intelligence + speed + endurance + firepower;

	public Transformer(String name, char type, int strength, int intelligence,
			int speed, int endurance, int rank, int courage, int firepower,
			int skill) {
		this.name = name;
		this.type = type;
		this.strength = strength;
		this.intelligence = intelligence;
		this.speed = speed;
		this.endurance = endurance;
		this.rank = rank;
		this.courage = courage;
		this.firepower = firepower;
		this.skill = skill;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getFirepower() {
		return firepower;
	}

	public void setFirepower(int firepower) {
		this.firepower = firepower;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getOverallRating() {
		return (strength + intelligence + speed + endurance + firepower);
	}

	
	// teams to be sorted by rank
	public int compareTo(Transformer o) {
		int compareRank = ((Transformer) o).getRank();
		return compareRank - this.rank;
	}

	public static void main(String[] args) {

		ArrayList<Transformer> transformers = new ArrayList<Transformer>();
		transformers
				.add(new Transformer("Hubcap", 'A', 4, 4, 4, 4, 4, 4, 4, 4));
		transformers.add(new Transformer("Soundwave", 'D', 8, 9, 2, 6, 7, 5, 6,
				10));
		transformers.add(new Transformer("Bluestreak", 'A', 6, 6, 7, 9, 5, 2,
				9, 7));
		
		Transformer[] transformersArr = transformers
				.toArray(new Transformer[0]);
		Arrays.sort(transformersArr);
		ArrayList<Transformer> transformersList = new ArrayList<Transformer>(
				Arrays.asList(transformersArr));
		for (int i = 0; i < transformersList.size(); i++) {
			System.out.println(transformersList.get(i).getName() + ","
					+ transformersList.get(i).getRank());
		}

	}

}
