import java.util.Scanner;
class TruckAssignment
{ public static void main(String[] args) {
int total = 3000;
int paid = 1000;
int diesel = 500;
int tax = 100;
int expense = paid + diesel + tax;
int profit = total - expense;

Scanner trucks = new Scanner(System.in);
System.out.println("Enter the number of trucks");
int truck = trucks.nextInt();

int earn = total * truck;
expense = expense * truck;
profit = profit * truck;

System.out.println("Total earning=" +earn);
System.out.println("Total expenses= " +expense);
System.out.println("Total profit= " +profit);
}}