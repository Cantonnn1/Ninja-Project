
public abstract class Powerups {

	private int quantity;
	private String name;
	private int price;

	public Powerups(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Powerups() {
		this.name = null;
		this.price = 0;
	}

	public int getQuantity() {
		return (quantity);

	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public abstract int multiplier();
}
