package WeatherApp.NotidicationChannel;

public class MobileApp implements Notification{
    private String mobileApp;
    public MobileApp(String mobileApp){
        this.mobileApp = mobileApp;
    }
    public void display(double temp, double hunidity, double pressure, String StationName){
        System.out.println("On Mobile "+ mobileApp);
        System.out.println("Acc to "+StationName);
        System.out.println("Temp:- "+temp);
        System.out.println("Pumidity:- "+hunidity);
        System.out.println("Pressure:- "+pressure);
    }
}
