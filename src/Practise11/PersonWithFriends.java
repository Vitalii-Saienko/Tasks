package Practise11;

import java.util.List;

public class PersonWithFriends {
    String name;
    List<String> friendsList;

    public PersonWithFriends(String name, List<String> friendsList) {
        this.name = name;
        this.friendsList = friendsList;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriendsList() {
        return friendsList;
    }
}
