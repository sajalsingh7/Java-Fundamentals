import java.util.Scanner;
public class Area {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        
System.out.print("Enter the base of the triangle: ");
double base = sc.nextDouble();
System.out.print("Enter the height of the triangle: ");
double height = sc.nextDouble();

        
double area = 0.5 * base * height;
System.out.println("The area of the triangle is: " + area);

sc.close();
}
}
