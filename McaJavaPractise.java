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
----------------------------------------------------------------------------------------------------
import java.util.Scanner;
class CalculateCircleAreaAndCir
{
 public static void main(String[] args)
 {
     Scanner scanner =new Scanner(System.in);
     double piValue=Math.PI;
     int radius=scanner.nextInt();
     double circum= 2* piValue *radius;
     System.out.println("circum"+circum);
     double area= piValue*Math.pow(radius,2);
     System.out.println("area"+area);
     scanner.close();
 }     
}    
-----------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class checkNumberIsMultipleByFive
{
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :");
     int number=sc.nextInt();
     if(number%5 ==0)
     {
      System.out.println("Given number is multiple by 5");
     }
     else
     {
      System.out.println("Given number is  not multiple by 5");  
     }
     sc.close();
 }
}
-----------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class checkNumberIsMultipleByFive
{
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :");
     int number=sc.nextInt();
     if(number%5 ==0)
     {
      System.out.println("Given number is multiple by 5");
     }
     else
     {
      System.out.println("Given number is  not multiple by 5");  
     }
     sc.close();
 }
}
------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class checkNumberIsMultipleByFive
{
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number :");
     int number=sc.nextInt();
     if(number%35 ==0)
     {
      System.out.println("Given number is multiple by 5");
     }
     else
     {
      System.out.println("Given number is  not multiple by 5");  
     }
     sc.close();
 }
}
-----------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class AverageCalculator
{
 public static void main (String[] args)
 {
   Scanner sc=new Scanner(System.in);     
   int count=0; double sum=0;
   while(count <5)
   {
     System.out.print("Enter number"+(count+1)+":");
     if(sc.hasNextDouble())
     {
         double number=sc.nextDouble();
         sum=+number;
         count++;
     }     
   }
    double average=sum/5;
    System.out.println("Average"+average);
 }
}
-----------------------------------------------------------------------------------------------------------------------------
    import java.util.Scanner;
class ReverseNumber
{
  public static void main (String [] args)
  {
      Scanner sc =new Scanner(System.in);
      int number =sc.nextInt();
      int reversed=0;
      while(number!=0)
      {
         int digit= number%10;
         reversed=reversed*10+digit;
         number /=10;
      }
    System.out.println("Reversed number: " + reversed);
  }
}    
--------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class PrintSumNumberWhile
{
  public static void main (String args[])
  {
      Scanner sc=new Scanner (System.in);
      int number= sc.nextInt();
      int sum=0;
      while(number!=0)
      {
         int digit= number%10;
         sum+=digit;
         number /=10;
      }
      System.out.println("sum"+sum);
      sc.close();
  }
}
-------------------------------------------------------------------------------------------------------------------------
import java.util.stream.IntStream;
class RangeEven
{
 public static void main (String[] args)
 {
     IntStream.rangeClosed(100,150).filter(num->num%2==0).forEach(System.out::println);
 }
}
-------------------------------------------------------------------------------------------------------------------------
//CheckPrimeorNot
import java.util.stream.IntStream;
class CheckPrimeNumberOrNot
{
 public static void main(String[] args)
 {
     int num=23;
     boolean checkPrime=num>1 && IntStream.rangeClosed(2,(int)Math.sqrt(num)).
     noneMatch(i->num %i==0);
     if(checkPrime)
     {
       System.out.println("This is a prime Number"); 
     }
     else
     {
       System.out.println("This  is not a prime Number");
     }
 }
} 
-----------------------------------------------------------------------------------------------------------------
// Generate the prime Numbers    
import java.util.stream.IntStream;
public class generatePrimeNumber
{
    public static void main (String [] args)
    {
        IntStream.iterate(2,i->i+1).filter(generatePrimeNumber::isPrime).limit(20).forEach(System.out::println);
    }
    public static boolean isPrime(int number)
    {
        if(number<2) return false;
        return IntStream.rangeClosed(2,(int)(Math.sqrt(number))).allMatch(i-> number%i !=0);
    }
}
-------------------------------------------------------------------------------------------------------------------
//String is panlindrom or not
 import java.util.Scanner;
class StringIsPandliromOrNot
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        String reversedString=new StringBuilder(input).reverse().toString();
        if(input.equals(reversedString))
        {
            System.out.println("This String is panlindrom");
        }
        else
        {
                        System.out.println("This String is not panlindrom");

        }
    }
}   

----------------------------------------------------------------------------------------------------------------------------
    
    

    
    
