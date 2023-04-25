import java.util.Arrays;

public class SortCircles {
    public static void main(String[] args) {
        ComparableCircle[] circles = {
            new ComparableCircle(5.4),
            new ComparableCircle(55.4),
            new ComparableCircle(35.4),
            new ComparableCircle(25.4)
        };
        Arrays.sort(circles);
        for (Circle circle : circles) {
            System.out.print(circle + " ");
            System.out.println();
        }
    }
}

