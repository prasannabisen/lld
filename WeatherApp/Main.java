package WeatherApp;

import WeatherApp.WheatherOperations.Operation;
import WeatherApp.NotidicationChannel.*;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation("Sarabhai Station");
        operation.suscribe(new MobileApp("98938"));
        operation.suscribe(new MobileApp("9752"));
        operation.suscribe(new DigitalBoard("Ghadi Chowk"));
        operation.suscribe(new DigitalBoard("CM House"));
        operation.suscribe(new EmergencyAlert("Ambulance"));

        operation.updateAll(21, 40, 10);

        Operation operation2 = new Operation("M k Gandhi Station");
        operation2.suscribe(new MobileApp("98938"));
        operation2.suscribe(new MobileApp("9752"));
        operation2.suscribe(new DigitalBoard("Ghadi Chowk"));
        operation2.suscribe(new DigitalBoard("CM House"));
        Notification ambulance = new EmergencyAlert("Ambulance");
        operation2.suscribe(ambulance);

        operation2.updateAll(29, 60, 40);

        System.out.println("====================");
        
        operation2.unSuscribe(ambulance);
        operation2.updateAll(29, 60, 40);
        
    }
}
