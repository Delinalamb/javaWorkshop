public class Program
{
    public String concatenation(String nameA,String nameB)
    {
        String name=nameA+" "+nameB;
        return name;

        
    }
    public static void main(String args[])
    {
        Program obj=new Program();
        String A=obj.concatenation("Delina","Simi");
        System.out.println(A);
    
    }
    
}