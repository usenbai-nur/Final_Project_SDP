package newsportal.core.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final List<String> notifications = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void receiveNotification(String notification) {
        notifications.add(notification);
    }

    public List<String> getNotifications() {
        return new ArrayList<>(notifications);
    }

    public void clearNotifications() {
        notifications.clear();
    }
}
