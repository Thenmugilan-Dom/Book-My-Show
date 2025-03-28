import java.util.ArrayList;

public class UsersAccount extends Accounts {
    String locationOfUser; // store user location
    ArrayList<Tickets> ticket = new ArrayList<>(); // array list of ticket


    public UsersAccount(String id,String password,String location){ // constructor
        super(id,password);
        this.locationOfUser = location;
    }

    // getter and setter

    public String getLocationOfUser() {
        return locationOfUser;
    }

    public ArrayList<Tickets> getTicket() {
        return ticket;
    }

    public void setLocationOfUser(String locationOfUser) {
        this.locationOfUser = locationOfUser;
    }

    
}
