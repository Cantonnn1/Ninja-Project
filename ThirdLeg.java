
public class ThirdLeg extends Powerups{
	
	public ThirdLeg () {
		super("ThirdLeg",1000);
	}

	
	public int modifier() {
		// return modifier to kick value per click/ ingame tik
		return (1*getQuantity());
	}
	public void purchase(boolean buy) {
		if (buy == true) {
			setQuantity(getQuantity()+1);
		}
	}
}
