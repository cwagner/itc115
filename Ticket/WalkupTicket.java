//concrete class modeling a walk up ticket
//inherits from abstract Ticket class
public class WalkupTicket extends Ticket {

	//constructor
	public WalkupTicket(int number) {
		super(number);
	}

	//implements inherited abstract class
	@Override
	public double getPrice() {
		return 50;
	}

}
