class evenOrNot
{
    public static void main (String[] args)
    {
        int n=3;
        if(n%2 ==0)
        {
            System.out.println("This is a Even Number");
        }
        else
        {
         System.out.println("This is a Odd Number");    
        }
    }
}
-------------------------------------------------------------------
  import java.util.Scanner;

class TempIntoFarh
{
    public static void main(String [] args)
    {
      Scanner scanner =new Scanner(System.in);
      double celsius= scanner.nextDouble();
      //celsius to  fahrenheit
      double fahrenheit = (celsius * 9/5) + 32;
      //  fahrenheit to   celsius    double celsius = (fahrenheit - 32) * 5 / 9;
      System.out.println("tempFah"+fahrenheit);
      scanner.close();     
    }    
}
--------------------------------------------------------------------------------
  import java.util.Scanner;

class AreaOfTirangle
{
  public static void main (String[] args)
  {
      Scanner scanner =new Scanner(System.in);
      System.out.println("Enter the value of first side :");
      double firstSide=scanner.nextDouble();
      
      System.out.println("Enter the value of second side :");
      double secondSide=scanner.nextDouble();
      
      System.out.println("Enter the value of third side :");
      double thirdSide=scanner.nextDouble();
      
      double s= (firstSide+secondSide + thirdSide)/2;
      
      double areeOfTirangle=Math.sqrt(s *(s-firstSide) * (s-secondSide) * (s-thirdSide));
      System.out.println("areeOfTirangle"+areeOfTirangle);
      
      
  }
}
-------------------------------------------------------------
import java.util.List;
import java.util.Arrays;
class FindOutAverger
{
 public static void main(String []  args)
 {
   List<Integer> numbers =Arrays.asList(1,2,3,4,5);
   Double average= numbers.stream().mapToInt(Integer :: intValue).average().orElse(0.0);
   System.out.println("average==>"+average);
 }     
}
-----------------------------------------------------------------------
  import java.util.List;
import java.util.Arrays;
class productOfRealNumber
{
 public static void main (String[] args)
 {
   List<Integer> numbers= Arrays.asList(1,2,3,4,5,7); 
   double getProductValue=numbers.stream().mapToInt(Integer::intValue).reduce(1,(a,b)->a*b);
   System.out.println("getProductValue"+getProductValue);
 }
}
