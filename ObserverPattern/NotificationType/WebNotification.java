package ObserverPattern.NotificationType;

public class WebNotification  implements Suscribe{
    private String webSite;
    public WebNotification(String webSite){
        this.webSite = webSite;
    }
    public void update(String videoTitle){
        System.out.println(videoTitle+" Sending App notification to " + webSite);
        return;
    }
}
