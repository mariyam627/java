import java.util.Scanner;
public class temperature {
public static void main(String[] args) {

double a,b,fahrenheit,celsius;

Scanner sc = new Scanner(System.in);

System.out.println("Select What to Convert");
System.out.println("1. Farenhiet");
System.out.println("2. Celsius");

if(a<=b){
 System.out.print("Input a degree in Celsius: ");
      Double celsius = sc.nextDouble();
 
              celsius = 13;  
              Fahrenheit = ((Celsius*9)/5)+32; 
     
System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
}
else
{
        System.out.print("Input a degree in Fahrenheit: ");
      Double fahrenheit = sc.nextDouble();

       Double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }
}}