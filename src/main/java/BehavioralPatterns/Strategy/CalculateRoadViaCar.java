package BehavioralPatterns.Strategy;

public class CalculateRoadViaCar implements CalculateRoad{

    public CalculateRoadViaCar() {
    }

    @Override
    public Road calculateRoad() {
        return Road.ROAD_CALCULATED_USING_CAR;
    }
}
