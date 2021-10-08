import java.util.Scanner;
public class MarkSheet
{ public static void main(String[] args) {
int english,urdu,java,physics,electronics,sum,roll;
String name,grade;
float div;
Scanner input = new Scanner(System.in);
System.out.println("Enter your Name==>"); 
name = input.next();
System.out.println("Enter your Roll Number==>");
roll = input.nextInt();
System.out.println("Enter your English Marks==>");
english = input.nextInt();
System.out.println("Enter your Urdu Marks==>");
urdu = input.nextInt();
System.out.println("Enter your Java Marks==>");
java = input.nextInt();
System.out.println("Enter your Physics Marks==>");
physics = input.nextInt();
System.out.println("Enter your Electronics Marks==>");
electronics = input.nextInt();
sum = english+urdu+java+physics+electronics;

if(sum>=90) {System.out.println("Grade____________________________A+" +grade);}
else if(sum>=80) {System.out.println("Grade_______________________A" +grade);}
else if(sum>=70) {System.out.println("Grade_______________________B" +grade);}
else if(sum>=60) {System.out.println("Grade_______________________C" +grade);}
else if(sum>=50) {System.out.println("Grade_______________________D" +grade);}
else if(sum>=40) {System.out.println("Grade_______________________E" +grade);}
else if(sum>=30) {System.out.println("Grade_______________________F" +grade);}
else {System.out.println("Check Again!");}

div = sum*100/500;

System.out.println("....................................");
System.out.println("Subject"+"                          Marks");
System.out.println("....................................");
System.out.println("English"+"__________________________"+english);
System.out.println("Urdu"+"_____________________________"+urdu);
System.out.println("Java"+"_____________________________"+java);
System.out.println("Physics"+"__________________________"+physics);
System.out.println("Electronics"+"______________________"+electronics);
System.out.println("..........................................");
System.out.println("Total Marks"+"______________________"+sum);
System.out.println("Percentage"+"_______________________"+div);


} } 
