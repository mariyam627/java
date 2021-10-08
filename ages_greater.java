import java.util.Scanner;
public class ages_greater {
public static void main(String[] args) {
System.out.println("Enter the age between 1 to 30, I ");
System.out.println("will tell you which age is greater");
int age;

System.out.println("Enter your age: ");
System.out.println("Enter your Brother age: ");
System.out.println("Enter your Sister age: ");
Scanner sc = new Scanner(System.in);
age = sc.nextInt();

switch (age) {
case 1:
System.out.println("Your Age is greater! ");
break;

case 20:
System.out.println("Your Brother age is greater! ");
break;

case 30:
System.out.println("Your Siser age is greater! ");
break;

default:
System.out.println("None of above");

System.out.println("Thanks for Testing! ");
} } }