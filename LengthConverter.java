import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Select What to Convert");
        System.out.println("1. Inch");
        System.out.println("2. Meter");
        System.out.println("3. Kilometer");
        
        int selection = s.nextInt();
        switch(selection){
            case 1: 
                fromInch(s);
                break; 
            case 2:
                fromMeter(s);
                break; 
            case 3:
                fromKilometer(s);
                break; 
            default:
                System.out.print("invalid selection");
                break; 
        }
        s.close();
    }
        static void fromInch(Scanner s){
            System.out.println("Input Length in Inch: ");
            double i = s.nextDouble();
            s.close();
            
            double m = i * 0.0254;
            double km = m / 1000;
            
            System.out.println("Meter: " + m);
            System.out.println("Kilometer: " + km);
        }
        
        static void fromMeter(Scanner s){
            System.out.println("Input Length in Meter: ");
            double m = s.nextDouble();
            s.close();
            
            double i = m / 0.0254;
            double km = m / 1000;
            
            System.out.println("Inch: " + i);
            System.out.println("Kilometer: " + km);
        }
        
        static void fromKilometer(Scanner s){
            System.out.println("Input Length in Kilometer: ");
            double km = s.nextDouble();
            s.close();
            
            double m = km * 1000;
            double i = m * 0.0254;
            
            System.out.println("Inch: " + i);
            System.out.println("Meter: " + m);
        }
}