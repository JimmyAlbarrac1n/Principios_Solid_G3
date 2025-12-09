package OC;

public class PushNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Push notification sent: " + message);
    }
}
