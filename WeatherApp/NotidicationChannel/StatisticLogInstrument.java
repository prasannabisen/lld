package WeatherApp.NotidicationChannel;

public class StatisticLogInstrument implements Notification {
    private String StaticInstrument;

    public StatisticLogInstrument(String instrument){
        this.StaticInstrument= instrument;
    }

    public void display(double temp, double hunidity, double pressure, String StationName) {
        System.out.println("On StaticLog " + StaticInstrument);
        System.out.println("Acc to " + StationName);
        System.out.println("Temp:- " + temp);
        System.out.println("Pumidity:- " + hunidity);
        System.out.println("Pressure:- " + pressure);
    }
}
