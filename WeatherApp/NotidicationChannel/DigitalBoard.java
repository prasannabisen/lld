package WeatherApp.NotidicationChannel;

public class DigitalBoard implements Notification{
    private String digitalBoard;
    public DigitalBoard(String digitalBoard){
        this.digitalBoard = digitalBoard;
    }
    public void display(double temp, double hunidity, double pressure, String StationName){
        System.out.println("On Digital Board "+ digitalBoard);
        System.out.println("Acc to "+StationName);
        System.out.println("Temp:- "+temp);
        System.out.println("Pumidity:- "+hunidity);
        System.out.println("Pressure:- "+pressure);
    }
}
