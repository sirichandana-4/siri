import java.util.Scanner;

public class circle {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter radius of circle: ");
double radius = scanner.nextDouble();
double area = Math.PI * radius * radius;
System.out.println("Area of circle: " + area);
}
}
