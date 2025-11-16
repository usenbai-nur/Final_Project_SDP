package newsportal.observer;

import newsportal.core.model.User;

public class UserSubscriber implements Observer {
    private final User user;

    public UserSubscriber(User user) {
        this.user = user;
    }
    @Override
    public void update(String message) {
        user.receiveNotification(message);
    }
    @Override
    public String getId() {
        return user.getUsername();
    }

    public User getUser() {
        return user;
    }
}
