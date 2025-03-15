
import java.util.*;   
public class Toll
{
    public static void main(String  args[])
    { 
        int car=100;
        double car2=car*0.1;
        double car3=car-car2;
        int truck=200;
        double truck2=truck*0.1;
        double truck3=truck-truck2;
    
    
        System.out.println("1.Car\n 2.truck\n");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter the choice:");
        int i=sc.nextInt();  
        if(i==1)
        {
            System.out.println("\n1RFID\n2.RFID");
            System.out.println("Enter your choice:");
            int rfid=sc.nextInt();
            if(rfid==1)
            {
                System.out.println("Toll fee:"+car3);
            }
         else 
        {
            System.out.println("Toll Fee:"+car);
        }
        }
        else if(i==2)
        {
         System.out.println("\n1RFID\n2.RFID");
            System.out.println("Enter your choice:");
            int rfid=sc.nextInt();
            if(rfid==1)
            {
                System.out.println("Toll fee:"+truck3);
            }
         else 
         {
            System.out.println("Toll Fee:"+truck);
            }
            }
        }
        }
}


