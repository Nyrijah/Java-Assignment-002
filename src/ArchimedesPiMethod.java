import java.util.Scanner;


public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while ( true ) {
            System.out.print("Enter up to 10 digets for a polygon(no words Please:");
            Scanner s = new Scanner(System.in);
            int numberSides = Integer.parseInt(s.nextLine());
            double calcualateAngle = 360.0 / numberSides;
            double calcualateLength = (calcualateAngle / 2);
            double side = 2 * Math.sin(Math.toRadians(calcualateLength));
            double polygon = numberSides * side;
            double Pi = polygon / 2;
            System.out.printf("Estimate for PI: %.15f Real PI: %.15f%n", Pi, Math.PI);
        }
    }
}
