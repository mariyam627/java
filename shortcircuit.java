public class shortcircuit
{
public static void main(String[] args)
{
short a=1500;
short b=2000;

boolean c=(a<=b)&&(a>b);
boolean d=(a<=b)||(a>b);

System.out.println("a<=b && a>b" +c);
System.out.println("a<=b || a>b" +d);

} }