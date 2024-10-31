package seminars.third.tdd;

public class User {

    String name;
    String password;
    Boolean admin;
    Boolean login;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.admin = false;
        this.login = false;
    }
    public void getAdmin(){this.admin = true;}
    public void loseAdmin(){this.admin = false;}
    public void loginIn(){this.login = true;}
    public void loginOut(){this.login = false;}

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

}