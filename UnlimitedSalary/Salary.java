import java.util.*;
public class Salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int j=1;
        while(true)
        {
        System.out.println("\n1.Developer\n2.Manager");
        System.out.println("Enter the choice:");
        int i=sc.nextInt();
        System.out.println("Enter the salary:");
        int salary=sc.nextInt();
        if(i==1)
        {
            double percent=salary*0.1;
            double salary1=salary+percent ;
             System.out.println("The salary is:"+salary1);
        }
    else if(i==2)
    {
        double percent2=salary*0.2;
        double salary2=salary+percent2;
        System.out.println("The salary is:"+salary2);
    }
    j=j+1;
        }
    }
}