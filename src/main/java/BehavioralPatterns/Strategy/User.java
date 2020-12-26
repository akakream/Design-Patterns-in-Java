package BehavioralPatterns.Strategy;

public class User {
    private Vehicle vehicle;

    public User() {
    }

    public User(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Road calculateRoad() {
        Road road;
        if (this.vehicle == Vehicle.CAR)
            road = new CalculateRoadViaCar().calculateRoad();
        else
            road = new CalculateRoadViaBicycle().calculateRoad();
        return road;
    }
}
