package DayFour;
import java.util.Scanner;
public class SinSeries {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        double angleInDegrees = sc.nextDouble();
        int seriesLength = 10; 
        double angleInRadians = degreesToRadians(angleInDegrees);
        double sineValueSeries = computeSineSeries(angleInRadians, seriesLength);
        System.out.println("Sine value using sine series: " + sineValueSeries);
    }
    private static double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180.0;
    }
    private static long fact(int n) {     
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    private static double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
   private static double computeSineSeries(double x, int len) {
        double result = 0.0;
        for (int i = 0; i < len; i++) {
            double term = power(-1, i) * power(x, 2 * i + 1) / fact(2 * i + 1);
            result += term;
        }
        return result;
    }
}
