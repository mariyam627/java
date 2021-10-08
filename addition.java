import java.util.Scanner;

public class addition 
{
 public static void main (String []args)
{
int a,b,c;

Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number:  ");
a = sc.nextInt();
System.out.println("Enter Second Number:  ");
b = sc.nextInt();
c = a + b;
System.out.println("The Result of Both Number Addtion:  " +c);
c = sc.nextInt();
}
}