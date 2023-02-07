package semester2;

public class max {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int m = 4;

        int k = max(i, j, m);

        System.out.println("The maximum between " + i + " and " + j + " and " + m + " is " + k);
    }

    public static int max (int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }

    public static int max (int num1, int num2, int num3) {
        int result;

        if (num1 > num2) {
            result = num1;
        }
        else if (num1 < num2) {
            result = num2;
        }
        else if (num2 > num3) {
            result = num2;
        }
        else if (num2 < num3) {
            result = num3;
        }
        else {
            result = num3;
        }
        return result;
    }
}
