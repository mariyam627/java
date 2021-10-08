import java.util.Scanner;
public class even_odd
{
public static void main(String[] args) {

System.out.println("Enter Number To Check the number is Even or Odd");
Scanner s = new Scanner(System.in);
int n = s.nextInt();

switch (n % 2) {
case 0:
System.out.println("This is Even Number");
break;
default:
System.out.println("This is Odd Number"); }

}
}