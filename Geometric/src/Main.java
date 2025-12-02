import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1, 1.5,1);
        t1.setColor("yellow");
        t1.setFilled(true);
        System.out.println(t1.toString());
        System.out.println("Area: " +t1.getArea());
        System.out.println("Perimeter: " +t1.getPerimeter());
        System.out.println("Color: " +t1.getColor());
        System.out.println("Filled: " +t1.isFilled());

        System.out.println("-------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 sides: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        Triangle t2 = new Triangle(s1,s2,s3);
        t2.setColor("blue");
        t2.setFilled(true);
        System.out.println(t2.toString());
        System.out.println("Area: " +t2.getArea());
        System.out.println("Perimeter: " +t2.getPerimeter());
        System.out.println("Color: " +t2.getColor());
        System.out.println("Filled: " +t2.isFilled());

    }
}