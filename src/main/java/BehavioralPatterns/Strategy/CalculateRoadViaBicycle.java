package BehavioralPatterns.Strategy;

public class CalculateRoadViaBicycle implements CalculateRoad{

    public CalculateRoadViaBicycle() {
    }

    @Override
    public Road calculateRoad() {
        return Road.ROAD_CALCULATED_USING_BICYCLE;
    }
}
