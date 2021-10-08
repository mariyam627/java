import java.util.Scanner;
public class ages {
public static void main(String[] args) {

int age;
System.out.println("Enter your age");
Scanner sc = new Scanner(System.in);
age = sc.nextInt();

switch (age) {
case 12:
System.out.println("enjoy your Childhood! your age is 12");
break;

case 16:
System.out.println("welcome to college life now you are above 16! ");
break;

case 25:
System.out.println("Time to get a job , your age is 25! ");
break;

default:
System.out.println("None of above");

System.out.println("Thanks for comming! ");
} } }