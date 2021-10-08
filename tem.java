import java.util.Scanner;
public class tem {

    public static void main(String[] Strings) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fahrenhiet to Celsius (1) or Celsius to Fahrenhiet (2)");
        int result = scan.nextInt();

        if (result == 1) {
System.out.println("You have chosen Fahrenhiet To Celsius!");
System.out.println("Enter FAHRENHIET Value: ");
double value = scan.nextDouble();
double valueFinal = (value - 32) * 5/9;
System.out.print("Celsius is: ");
System.out.println(Math.round(valueFinal*10.0)/10.0);


        } else if (result == 2) {
System.out.println("You have chosen Celsius To Fahrenhiet!");
System.out.println("Enter Celsius Value: ");
double value2 = scan.nextDouble();
double finalResult = value2 * 1.8 + 32;
System.out.print("Fahrenhiet is: ");
System.out.println(Math.round(finalResult*10.0)/10.0);

        } else {
            System.out.println("Not a Valid Choice!");
        } } }