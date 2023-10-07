public class K5 extends Car{
    private final int fuelEfficiency = 13;
    private final double tripDistance;

    public K5(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return this.tripDistance / fuelEfficiency;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return "K5";
    }
}
