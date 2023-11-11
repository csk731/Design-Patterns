package structural.facade.notification;

public class AppNotificationService implements NotificationService{

    @Override
    public boolean sendNotification() {
        System.out.println("Notification Sent");
        return true;
    }
}
