public class Sonata extends Car{
    private final int fuelEfficiency = 10;
    private final double tripDistance;

    public Sonata(double tripDistance) {
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
        return "Sonata";
    }
}
