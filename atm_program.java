import util.java.Scanner

public class atm_program
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
int note5000,note1000,note500,note100,note50,note20,note10,note5,note1;
note5000 = note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note1 = 0;

System.out.println("Enter Amout");
int amount = sc.nextInt();

if(amout >= 5000);
{
 note5000 = amount/5000;
 amount -= note5000*5000;
}

else if(amount>=1000)
{
 note1000 = amount/1000;
 amount -= note1000*1000;
}

else if(amount>=1000)
{
 note500 = amount/500;
 amount -= note500*500;
}

else if(amount>=100)
{
 note100 = amount/100;
 amount -= note100*100;
}

else if(amount>=50)
{
 note50 = amount/50;
 amount -= note50*50;
}

else if(amount>=20)
{
 note20 = amount20;
 amount -= note20*20;
}

else if(amount>=10)
{
 note10 = amount10;
 amount -= note10*10;
}

else if(amount>=5)
{
 note5 = amount5;
 amount -= note5*5;
}

else (amount>=1)
{
 note1 = amount1;
 amount -= note1*1;
}

 System.out.println("Number of 5000 Notes: " +note5000);
 System.out.println("Number of 1000 Notes: " +note1000);
 System.out.println("Number of 500 Notes:  " +note500);
 System.out.println("Number of 100 Notes:  " +note100);
 System.out.println("Number of 50 Notes:   " +note50);
 System.out.println("Number of 10 Notes:   " +note10);
 System.out.println("Number of 5 Notes:    " +note5);
 System.out.println("Number of 1 Notes:    " +amount);
  

}
}