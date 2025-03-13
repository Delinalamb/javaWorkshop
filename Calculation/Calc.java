import java.util.*;
public class Calc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        if(choice==1)
        {
        System.out.println("Enter number one:");
        int num1 = sc.nextInt();
        System.out.println("Enter number two:");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
        }
        else if(choice==2){
        System.out.println("Enter number one:");
        int num1 = sc.nextInt();
        System.out.println("Enter number two:");
        int num2 = sc.nextInt();
        System.out.println(num1-num2);
        }
        else if(choice==3)
        {
        System.out.println("Enter number one:");
        int num1 = sc.nextInt();
        System.out.println("Enter number two:");
        int num2 = sc.nextInt();
        System.out.println(num1*num2);
        }
        else{
        System.out.println("Enter number one:");
        int num1 = sc.nextInt();
        System.out.println("Enter number two:");
        int num2 = sc.nextInt();
        System.out.println(num1/num2);
        }
    }
}