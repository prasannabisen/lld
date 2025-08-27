package Singleton;

import java.util.ArrayList;
import java.util.List;

public class DbConnection {
    private static DbConnection instance;
    public static List<Integer> arr = new ArrayList<>();
    private DbConnection (){
        
    }

    public static DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }
}
