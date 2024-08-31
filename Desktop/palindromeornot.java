import java.util.Scanner;
public class palindromeornot
{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number: ");
int number = scanner.nextInt();
if(isPalindrome(number))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
scanner.close();
}
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int originalNumber = num;
        int reversedNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }
}