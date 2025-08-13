package WeatherApp.NotidicationChannel;

public class EmergencyAlert implements Notification {
    private String emergyncyService;

    public EmergencyAlert(String emergencyService) {
        this.emergyncyService = emergencyService;
    }

    public void display(double temp, double hunidity, double pressure, String StationName) {
        System.out.println("On Emergency Alert " + emergyncyService);
        System.out.println("Acc to " + StationName);
        System.out.println("Temp:- " + temp);
        System.out.println("Pumidity:- " + hunidity);
        System.out.println("Pressure:- " + pressure);
    }
}
