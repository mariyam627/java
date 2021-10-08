import java.util.Scanner;
public class Track
{
 public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

double totalincome = 3000;
double driversalary = 1000;
double diesal = 500;
double tax = 100;

double totalexpense = driversalary + diesal + tax;
double profit = totalincome - totalexpense;

System.out.println("Enter your name: ");
String name = sc.nextLine();

System.out.println("Enter the Number of trucks: ");
int truck = sc.nextInt();

double earning = totalincome * truck;
totalexpense = totalexpense * truck;
profit = profit * truck;

System.out.println("Total Earning: " +earning);
System.out.println("Total Expenses: " +totalexpense);
System.out.println("Total profit: " +profit);
} }