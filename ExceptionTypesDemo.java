import java.io.*;
class Demo
{
    static void fun1()throws IOException
    {   System.out.println("Enter any character:\t");
        System.in.close();
        int r=System.in.read();  //   97 <= read() <= a
        //compiler will recognize that in the above statement, the IOException will be raised, because it is un-reported exception
    }
    static void fun2(){
        int a=10,b=0;
        int c=a/b;//compiler will not recognize that here ArithmeticException will be raised, because it is reported exception
        System.out.println("c="+c);
    }
}
public class ExceptionTypesDemo 
{
    public static void main(String[] args) throws IOException
    {  
        System.out.println("start...");
        Demo.fun1(); 
        System.out.println("end...");
    }    
}
