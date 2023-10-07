import cordinate.CoordinateUtil;
import cordinate.Point;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class CoordinateCalculatorTest {

    @Test
    public void parseCoordinates() {
        String inputCoordinates = "(10,10)-(14,15)";
        Point[] points = CoordinateUtil.parseCoordinates(inputCoordinates);
        assertThat(points[0].getX()).isEqualTo(10);
        assertThat(points[0].getY()).isEqualTo(10);
        assertThat(points[1].getX()).isEqualTo(14);
        assertThat(points[1].getY()).isEqualTo(15);
    }

    @Test
    public void checkCoordinates() {
        String inputCoordinates = "(10,10)-(14,15)";
        Point[] points = CoordinateUtil.parseCoordinates(inputCoordinates);
        boolean flag = CoordinateUtil.isExceed(points);
        assertThat(flag).isEqualTo(false);

        String inputCoordinates_2 = "(10,25)-(14,15)";
        Point[] points_2 = CoordinateUtil.parseCoordinates(inputCoordinates_2);
        boolean flag_2 = CoordinateUtil.isExceed(points_2);
        assertThat(flag_2).isEqualTo(true);
    }

    @Test
    public void calculateDistance() {
        String inputCoordinates = "(10,10)-(14,15)";
        Point[] points = CoordinateUtil.parseCoordinates(inputCoordinates);
        double result = CoordinateUtil.calculateDistance(points);
        assertThat(result).isEqualTo(6.403124, offset(0.00099));
    }

    @Test
    public void displayCoordinates() {
        String inputCoordinates = "(10,10)-(14,15)";
        Point[] points = CoordinateUtil.parseCoordinates(inputCoordinates);
        CoordinateUtil.display(points);
    }
}
