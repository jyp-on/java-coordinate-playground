public class Avante extends Car{
    private final int fuelEfficiency = 15;
    private final double tripDistance;

    public Avante(double tripDistance) {
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
        return "Avante";
    }
}
