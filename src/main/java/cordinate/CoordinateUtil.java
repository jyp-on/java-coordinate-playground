package cordinate;

public class CoordinateUtil {

    public static boolean isExceed(Point[] points) {
        return points[0].isExceed() || points[1].isExceed();
    }

    public static double calculateDistance(Point[] points) {
        Point p1 = points[0];
        Point p2 = points[1];
        // 직선인 경우 두 점 사이의 거리 계산
        if (p1.getX() == p2.getX()) return Math.abs(p1.getY() - p2.getY());
        if (p1.getY() == p2.getY()) return Math.abs(p1.getX() - p2.getX());

        // 직선이 아닐 경우 두점 사이 거리 공식을 이용하여 계산
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static Point[] parseCoordinates(String coordinates) {
        String[] points = coordinates.split("-");
        String[] point1 = points[0].replaceAll("[()]", "").split(",");
        String[] point2 = points[1].replaceAll("[()]", "").split(",");

        Point p1 = new Point(Integer.parseInt(point1[0]), Integer.parseInt(point1[1]));
        Point p2 = new Point(Integer.parseInt(point2[0]), Integer.parseInt(point2[1]));

        return new Point[] {p1, p2};
    }

    public static void display(Point[] points) {
        Point p1 = points[0];
        Point p2 = points[1];

        String[][] grid = new String[24][24];

        // Initialize the grid with '.'
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++) {
                grid[i][j] = " ";
            }
        }

        grid[p1.getX()-1][p1.getY()-1] = "*";
        grid[p2.getX()-1][p2.getY()-1] = "*";

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
