import java.util.Scanner;

/**
   This class converts between two units.
*/
public class ConversionCalculator2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Convert from:");
      String fromUnit = in.nextLine();

      System.out.println("Convert to: ");
      String toUnit = in.nextLine();
      
      UnitConverter from = new UnitConverter(fromUnit);
      UnitConverter to = new UnitConverter(toUnit);

      System.out.println("Value:");
      double val = in.nextDouble();

      double meters = from.toMeters(val);
      double converted = to.fromMeters(meters);

      System.out.println(val + " " + fromUnit + " = " + converted + " " + toUnit);
   }
}