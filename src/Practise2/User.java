package Practise2;
/*
Select a site and describe fields, methods, and entities. Please provide a link to the site.
The site must contain decent content.
https://music.youtube.com
 */
public class User {
    private String name;
    private String email;
    private static int userID = 0;
    private Playlist playlist;
    private boolean isRegistered;
    private String password;

    public User(String name, String email, Playlist playlist, boolean isRegistered) {
        this.name = name;
        this.email = email;
        this.playlist = playlist;
        this.isRegistered = isRegistered;
    }

    private boolean login(){
        //TODO some logic
        return false;
    }
    private boolean logout(){
        //TODO some logic
        return false;
    }
    public void changePassword(String oldPassword, String newPassword) {
        //TODO some logic
        this.password = newPassword;
    }
    boolean isRegistered() {
        return isRegistered;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static int getUserID() {
        return userID;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", playlist=" + playlist +
                ", isRegistered=" + isRegistered +
                '}';
    }
}
