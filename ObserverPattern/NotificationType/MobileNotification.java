package ObserverPattern.NotificationType;

public class MobileNotification implements Suscribe{
    private String mobileNumber;
    public MobileNotification(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public void update(String videoTitle){
        System.out.println(videoTitle+" Sending App notification to " + mobileNumber);
        return;
    }
}
