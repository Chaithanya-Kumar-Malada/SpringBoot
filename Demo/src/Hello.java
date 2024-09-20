import java.util.Scanner;
public class Hello
{
public static void main(String []args)
{
//Creating object of Scanner class for taking input from User.
Scanner sc=new Scanner(System.in);
System.out.println("Enter age of Male or Female");
int age=sc.nextInt();
System.out.println("Enter Gender of Human like male or female");
String gen=sc.nextLine();
if(gen=="male")
{

if(age>=21)
{
System.out.println("Male is eligible for marriage becz age is:"+age);
}
else
{
System.out.println("Male is not  eligible for marriage becz age is:"+age);
}
}

else if(gen=="female")
{
if(age>=18)
{
System.out.println("female is eligible for marriage becz age is:"+age);
}
else
{
System.out.println("female is not  eligible for marriage becz age is:"+age);
}
}
else
{

System.out.println("Not eligible for marriage becz gen is NNN:");
}
}

}