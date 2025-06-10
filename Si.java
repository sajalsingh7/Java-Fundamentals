import java.util.Scanner;

public class Si {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter principal amount: ");
double p = sc.nextDouble();

System.out.print("Enter annual interest rate (in %): ");
double r = sc.nextDouble();

System.out.print("Enter time (in years): ");
double t = sc.nextDouble();

double si = (p * r * t) / 100;

System.out.printf("Simple Interest = %.2f%n", si);

sc.close();
}
}
