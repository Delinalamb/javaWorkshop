import java.util.*;
public class Sum
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value:");
    int n=sc.nextInt();
    int a[]=new int[n];
    int i=0;
    int sum=0;
    while(i<n)
    {
        System.out.println("Enter the value:");
        a[i]=sc.nextInt();
        i=i+1;
        
    }
    i=0;
    while(i<n)
    {
        sum=sum+a[i];
        i++;
    }
    System.out.println(sum);
    }
}