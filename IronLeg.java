
public class IronLeg {

	// Variable list
	int multiplier;
	int upgradeLevel;
	int cost;
	boolean exists;

	public IronLeg(int upgradeLevel) {
		// Setting the variables
		this.upgradeLevel = upgradeLevel;
		this.multiplier = 1;
		this.cost = 5;
		this.exists = true;

	}

	// Used for when updating the level of the object
	public void updateLevel(int level) {
		this.upgradeLevel = level;
		if (upgradeLevel == 0) // Sets multiplier to 1 for when level is 0
			this.multiplier = 1;
		else if (upgradeLevel == 1) { // Sets multiplier to 2 for when level is 1
			this.multiplier = 2;
			this.cost = 20;
		} else if (upgradeLevel == 2) { // Sets multiplier to 3 for when level is 2
			this.multiplier = 3;
			this.cost = 100;
		} else if (upgradeLevel == 3) { // Sets multiplier to 3 for when level is 2
			this.multiplier = 4;
			this.cost = 500;
		} else if (upgradeLevel == 4) { // Sets multiplier to 3 for when level is 2
			this.multiplier = 5;
			this.cost = 1000;
		} else if (upgradeLevel == 5) { // Sets multiplier to 4 for when level is 3
			this.multiplier = 6;
			this.exists = false; // Marks the object as false for existing because it has lived out its purpose
		}
	}

	// Getting the name for the button regarding different levels
	public String getName() {
		if (upgradeLevel == 0)
			return ("2x Click, Cost: " + getCost());
		if (upgradeLevel == 1)
			return ("3x Click, Cost: " + getCost());
		if (upgradeLevel == 2)
			return ("4x Click, Cost: " + getCost());
		if (upgradeLevel == 3)
			return ("5x Click, Cost: " + getCost());
		if (upgradeLevel == 4)
			return ("6x Click, Cost: " + getCost());
		else
			return null;
	}

	// returns exists
	public boolean getExists() {
		return exists;
	}

	// returns cost
	public int getCost() {
		return cost;
	}

	// returns upgradeLevel
	public int getLevel() {
		return upgradeLevel;
	}

	// returns multiplier
	public int getMultiplier() {
		return multiplier;
	}

}
