// Swap the values of variables as by using arithmetic operations
class SwapNumbers
{
 public static void main(String []args)
    {
        int j = 92;
        int k = 34;
System.out.println("--Before swap--");
        System.out.println("j = " + j);
        System.out.println("k = " + k);

j = j + k;
k = j - k; 
j = j - k;
    System.out.println("After swaping");
    System.out.println("j : "+k);
    System.out.println("k : "+j);
      
    }
}