package WeatherApp.WheatherOperations;

import java.util.ArrayList;
import java.util.List;

import WeatherApp.NotidicationChannel.Notification;

public class Operation {
    private List<Notification> list = new ArrayList<>();
    public String StationName; 

    public Operation(String stationName){
        this.StationName = stationName; 
    }

    public void suscribe(Notification notifi){
        list.add(notifi);
    }

    public void unSuscribe(Notification notifi){
        list.remove(notifi);
    }

    public void updateAll(int temp, int humidity, int pressure){
        for(Notification it: list){
            it.display(temp, humidity, pressure, this.StationName);
        }
    }
}
