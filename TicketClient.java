
public class TicketClient {

	public static void main(String[] args) {
		
		//creates an array of 4 Walk-up Tickets, with numbers 1-4
		WalkupTicket[] tickets = new WalkupTicket[4];
		for (int i = 0; i < tickets.length; i++) {
			tickets[i] = new WalkupTicket(i + 1);
		}
		
		//prints toString for tickets #2 and #4
		System.out.println(tickets[1].toString());
		System.out.println(tickets[3].toString());

	}

}
