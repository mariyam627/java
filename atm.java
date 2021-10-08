import java.util.Scanner;

public class atm
{
 public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

String name,roll;

System.out.println("Enter your Name==>"); 
name = sc.nextLine();
System.out.println("Enter your Roll Number==>");
roll = sc.nextLine();

int amount;
int note5000,note1000,note500,note100,note50,note20,note10,note5,note2,note1;
note5000 = note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;

System.out.println("Enter Amount");
amount = sc.nextInt();

if(amount >= 5000);
{
 note5000 = amount / 5000;
 amount = amount % 5000;
}

if(amount >= 1000);
{
 note1000 = amount / 1000;
 amount = amount % 1000;
}

if(amount >= 500);
{
 note500 = amount / 500;
 amount = amount % 500;
}

if(amount >= 100);
{
 note100 = amount / 100;
 amount = amount % 100;
}

if(amount >= 50);
{
 note50 = amount / 50;
 amount = amount % 50;
}

if(amount >= 20);
{
 note20 = amount/20;
 amount = amount % 20;
}

if(amount >= 10);
{
 note10 = amount/10;
 amount = amount % 10;
}

if(amount >= 5);
{
 note5 = amount/5;
 amount = amount % 5;
}

if(amount >= 2);
{
 note5 = amount/2;
 amount = amount % 2;
}

if (amount >= 1);
{
 note1 = amount / 1;
 amount = amount % 1;
}

System.out.println("5000 * "+note5000+" = "+(5000 * note5000));
System.out.println("1000 * "+note1000+" = "+(1000 * note1000));
System.out.println("500 * "+note500+" = "+(500 * note500));
System.out.println("100 * "+note100+" = "+(100 * note100));
System.out.println("50 * "+note50+" = "+(50 * note50));
System.out.println("20 * "+note20+" = "+(20 * note20));
System.out.println("10 * "+note10+" = "+(10 * note10));
System.out.println("5 * "+note5+" = "+(5 * note5));
System.out.println("2 * "+note2+" = "+(2 * note2));
System.out.println("1 * "+note1+" = "+(1 * note1));

}
}