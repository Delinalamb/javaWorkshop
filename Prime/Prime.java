import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        if(prime(n))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
        public  static boolean prime(int n)
        {
            if(n<=1)
            {
                return false;
            }
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
                return true;
        }
    
}