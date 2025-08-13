package ObserverPattern.NotificationType;

public class AppNotification implements Suscribe {
    private String AppName;

    public AppNotification(String AppName) {
        this.AppName = AppName;
    }

    public void update(String videoTitle) {
        System.out.println(videoTitle+" Sending App notification to " + AppName);
        return;
    }
}
