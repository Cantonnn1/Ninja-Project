
public class ThirdLeg extends Powerups {

	int price = 5;

	public ThirdLeg() {
		super("ThirdLeg", 5);
	}

//	
//	public int modifier() {
//		// return modifier to kick value per click/ ingame tik
//		return (1*getQuantity());
//	}
//	public void purchase(boolean buy) {
//		if (buy == true) {
//			setQuantity(getQuantity()+1);
//		}
//	}

	public int modifier() {

		return getQuantity();
	}

	public void updatePrice() {
		price = price * 2;
	}

	public int getPrice() {
		return price;
	}

}
