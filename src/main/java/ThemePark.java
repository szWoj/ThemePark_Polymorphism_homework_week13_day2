import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> attractionsAndStalls;


    public ThemePark(){
        this.attractionsAndStalls = new ArrayList<IReviewed>();
    }

    public ArrayList getAllReviewed(){
        return attractionsAndStalls;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(attraction.getVisitCount() + 1);
        visitor.addAttractionToVisitedAttractions(attraction);

    }
}
