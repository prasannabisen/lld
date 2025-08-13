package ObserverPattern;

import ObserverPattern.NotificationType.*;
import ObserverPattern.Suscriber.UserOperation;

public class Main {
    public static void main(String[] args) {
        UserOperation uo = new UserOperation("prasannaBisen");
        uo.Suscribe(new WebNotification("youtube"));

        uo.Suscribe(new MobileNotification("8085149997"));
        uo.Suscribe(new MobileNotification("99899123"));
        uo.Suscribe(new AppNotification("zomato"));

        uo.uploadVideo("Vlog 505");

    }
}
