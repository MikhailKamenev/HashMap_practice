package User;

import java.util.HashMap;

public class UsersList {
    private HashMap<String, String> usersList = new HashMap<>();

    public void addUser(User user) {
        usersList.put(user.getName(), user.getPhoneNumber());
    }

    public void removeUser(User user) {
        usersList.remove(user.getName());
    }

    @Override
    public String toString() {
        return usersList.toString();
    }
}
