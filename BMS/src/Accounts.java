public abstract class Accounts { // Abstract class
    protected String id; // store id
    protected String password; // store password

    public Accounts( String id, String password) { // constructor

        this.id=id;
        this.password=password;

    }

    public String getId(){
        return id;
    }



    public String getPassword(){
        return password;
    }

}
