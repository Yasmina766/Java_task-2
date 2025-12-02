import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width & height: ");
        double width = input.nextDouble();
        double height = input.nextDouble();
        Rectangle r1 = new Rectangle(width,height);
        System.out.println("The area of r1 = "+r1.getArea());
        System.out.println("The Perimeter of r1 = "+r1.getPerimeter());
        System.out.println("-----------------------------------------------------");
        Rectangle r2 = new Rectangle();
        System.out.println("The area of r2 = "+r2.getArea());
        System.out.println("The Perimeter of r2 = "+r2.getPerimeter());

        }
    }
