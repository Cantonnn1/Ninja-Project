
public class IronLeg extends Powerups {

	public IronLeg() {
		super("Ironleg", 50);
		setQuantity(0);
	}

	public int modifier() {
		int kicks = 30 * getQuantity();
		return kicks;
	}

	public void purchase(int x) {
		setQuantity(getQuantity() + x);
	}


	}
