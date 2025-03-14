public class Method
{
    public int add(int A, int B)
    {
        return A+B;
        }
        public int add (int A,int B, int C)
        {
            return A+B*C;
        }
        public static void main(String args[])
        {
            Method obj=new Method();
            int C=obj.add(10,20);
            int d=obj.add(10,20,30);
            System.out.println(C);

            System.out.println(d);
            
        }
    
}
    
