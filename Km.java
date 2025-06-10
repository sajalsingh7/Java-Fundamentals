import java.util.Scanner;

public class Km {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter kilometers: ");
double km = sc.nextDouble();
double miles = km * 0.621371; // conversion factor
System.out.println(km + " kilometers = " + miles + " miles");
sc.close();
}
}
