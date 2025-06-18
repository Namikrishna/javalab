class MovieTickets {
    String movieName;
    int seats;
    double ratePerTicket;

    MovieTickets(String Name, int noOfSeats, double TicketRate) {
        this.movieName = Name;
        this.seats = noOfSeats;
        this.ratePerTicket = TicketRate;
    }

    double calculateTotal(){

        return seats*ratePerTicket ;
    }

    boolean isAvailable(int requestedSeats){
        return requestedSeats <= seats;

    }


}

public class MovieTicket{
    public static void main(String[] args){
        MovieTickets m = new MovieTickets("Takeof",100,150.0);
        double total = m.calculateTotal();
        System.out.println("The cost of the Movie Ticket:" +total);
        boolean available = m.isAvailable(3);
        System.out.println("isAvailable:" +available);
    }
}



