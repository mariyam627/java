import java.util.Scanner;
public class leapyear {
public static void main(String[] args) {

System.out.println("Enter a year to check this year is leap year or not: ");

Scanner scan = new Scanner(System.in);
int year = scan.nextInt();

switch(year % 4){
case 0:
    if(year % 100 == 0){
      if(year % 400 == 0){
System.out.println(year+ " is not a leap year"); }
else
System.out.println(year+ " is not a leap year"); }
else
System.out.println(year+ " is a leap year");
break;
default:
       System.out.println(year+ "is not a leap year ");
}
}
}