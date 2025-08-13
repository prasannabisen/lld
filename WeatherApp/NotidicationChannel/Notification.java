package WeatherApp.NotidicationChannel;

public interface Notification {
    public void display(double temp, double hunidity, double pressure, String StationName);
}
