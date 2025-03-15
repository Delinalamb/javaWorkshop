import java.util.*;
public class Grade
{
    public void calculateGrade(int mark)
    {
    if(mark>=90)
    {
        System.out.println("Grade A pass");
    }
    else if(mark>=75)
    {
        System.out.println("Grade B ");
    }
    else if(mark>=50)
    {
        System.out.println("Grade C ");
    }
    else
    {
    System.out.println("Grade F");
    }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("mark");
            int mark1=sc.nextInt();
            Grade obj=new Grade();
            obj.calculateGrade(mark1);
        }
    }

}