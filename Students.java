
public class Students extends Powerups {

	int price = 500;

	public Students() {
		super("Super", 500);

	}

	public int modifier() {

		return getQuantity();
	}

	public void updatePrice() {
		price = price * 2;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return "Student Price: " + price;
	}

}
