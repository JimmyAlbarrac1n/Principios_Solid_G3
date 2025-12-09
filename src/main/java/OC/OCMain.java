package OC;

public class OCMain {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();
        Notification pushNotification = new PushNotification();

        notificationService.sendNotification(emailNotification, "Welcome via Email!");
        notificationService.sendNotification(smsNotification, "Welcome via SMS!");
        notificationService.sendNotification(pushNotification, "Welcome via Push Notification!");
    }
}
