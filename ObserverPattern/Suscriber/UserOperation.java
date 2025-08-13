package ObserverPattern.Suscriber;

import java.util.ArrayList;
import java.util.List;
import ObserverPattern.NotificationType.Suscribe;

public class UserOperation {
    List<Suscribe> sus = new ArrayList<>();
    String channelName ;

    public UserOperation(String channelName){
        this.channelName = channelName;
    }

    public void Suscribe(Suscribe user) {
        sus.add(user);
    }

    public void unSuscribe(Suscribe user) {
        sus.remove(user);
    }

    public void notifySuscriber(String videoTitle) {
        for(Suscribe it: sus){
            it.update(videoTitle);
        }
    }

    public void uploadVideo(String videoName) {
        notifySuscriber(videoName);
    }
}
