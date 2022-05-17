package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }
    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 18){
            return true;
        }
        return false;
    }
}
