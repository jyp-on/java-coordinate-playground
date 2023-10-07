package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");

    private static List<Car> carList;

    public static RentCompany create() {
        carList = new ArrayList<Car>();
        return new RentCompany();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            sb.append(car.getName()).append(" : ")
                    .append((int) car.getDistancePerLiter())
                    .append("리터").append(NEWLINE);
        }

        return sb.toString();
    }
}
