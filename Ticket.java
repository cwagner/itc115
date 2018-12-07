//general Ticket
//not instantiated, but inherited by more specific classes
public abstract class Ticket {
	//fields
	private int number;
	
	//constructor
	public Ticket(int number) {
		this.number = number;
	}
	
	public abstract double getPrice();
	
	@Override
	public String toString() {
		return String.format("Number: %d, Price: $%.2f", number, getPrice());
	}
}
