import java.util.Scanner;

public class celtofah {
    public static void main(String[] args) {
		System.out.println("Enter a temperature in Celsius: ");
		Scanner in = new Scanner(System.in);
		double Fahrenheit = 0;
		if(in.hasNextDouble()){
			Fahrenheit = (in.nextDouble() + 32)*9/5;
        }
        System.out.println("The temperature in Fahrenheit is: "+Fahrenheit);
    }
 
}