package Factory;

import Factory.Ways.Air;
import Factory.Ways.Road;
import Factory.Ways.WayInterface;

public class Factory {
    public WayInterface selectWays(String ways){
        if(ways.equals("road")){
            return new Road();
        }
        return new Air();
    }
}
