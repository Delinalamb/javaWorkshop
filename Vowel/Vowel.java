import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        String arr[]={"a","e","i","o","u"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter");
        String letter=sc.nextLine();
        int i=0;
        int d=0;
        while(i<=4)
        {
        if(letter.equals(arr[i]))
        {
            d=1;
        }
        i=i+1;
        }
        if(d==1)
        {
            System.out.println("Its vowel");
        }
        else
        {
            System.out.println("its not vowel");
        }

}
}