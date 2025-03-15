class Inherit
{
    public void add()
    {
        System.out.println("hi");
    }
}
class Child extends Inherit
{
    void display()
    {
        add();
    }
}
public class Inheritance
{
    public static void main(String args[])
    {
        Child ob=new Child();
        ob.display();
    }
}
