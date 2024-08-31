import java.util.Scanner;
public class add
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the first number");
double num1=scanner.nextDouble();
System.out.println("enter the second number");
double num2=scanner.nextDouble();
double sum=num1+num2;
System.out.println("sum of " +num1+ " and " +num2+ " is " +sum);
scanner.close();
}
}