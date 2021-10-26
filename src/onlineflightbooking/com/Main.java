package onlineflightbooking.com;

public class Main {

	public static void main(String[] args) {
		Ticket regularTicket = new RegularTicket("265-9744793", "Mumbai",
                "Bangalore", "26 OCT 2021 07;15AM", "26 OCT 2021 10:05AM",
                "5A", 3500, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("123-7654971", "India", "Japan",
                "26 OCT 2021 07;25AM", "27 OCT 2021 09:55AM",
                "7A", 15000, false, null, null,
                "Japanese Welcome Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }


}
