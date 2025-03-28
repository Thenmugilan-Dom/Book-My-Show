import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Tickets {
    private String nameOfTheater; // store theater name
    private String nameOfMovie; // store movie name
    private String nameOfScreen; // store screen name
    private String locationOfTheater;// store location theater
    private LocalTime startingTime; // store starting time
    private ArrayList<String> ticketsBooked; //arraylist of
    private int ticketPrice;
    

    // getter and setter
    public String getNameOfTheater() {
        return nameOfTheater;
    }



    public String getNameOfScreen() {
        return nameOfScreen;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public String getLocationOfTheater() {
        return locationOfTheater;
    }

    public LocalTime getStartingTime() {
        return startingTime;
    }

    public ArrayList<String> getTicketsBooked() {
        return ticketsBooked;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public void setLocationOfTheater(String locationOfTheater) {
        this.locationOfTheater = locationOfTheater;
    }

    public void setNameOfTheater(String nameOfTheater) {
        this.nameOfTheater = nameOfTheater;
    }

    public void setNameOfScreen(String nameOfScreen) {
        this.nameOfScreen = nameOfScreen;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setStartingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
    }

    public void setTicketsBooked(ArrayList<String> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

}
