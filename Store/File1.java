import java.util.*;
public class File1{
    public void calculateTotalPrice(int prices, boolean isPremiumMember){
if(isPremiumMember)
{
double finalprice=prices-prices*0.05;
System.out.println(finalprice);
}
if(prices>=5000){
    double finalprice2=prices-prices*0.1;
    System.out.println(finalprice2);
}
}
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            while(true){
            System.out.println("Price:");
            int price=sc.nextInt();
            boolean isPremiumMember=true;
            File1 obj=new File1();
            obj.calculateTotalPrice(price,isPremiumMember);
            
        }

    }
    }