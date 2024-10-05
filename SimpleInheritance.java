class Base extends Object
{
    int a,b;
    Base()
    {   super(); //Base/super class constructor calling statement
        a=10; //this.a=10
        b=20; //this.b=20
    }
    void display()
    {   System.out.println("instance method of base class");
        System.out.println("a:\t"+a);
        System.out.println("b:\t"+b);
    }
}
class Child extends Base
{
    int c,d;
    Child()
    {   super(); //super class constructor calling
        c=30;  //this.c=30
        d=40; //this.d=40
    }
    void display()
    {   System.out.println("instance method of Child class");
        super.display();
        System.out.println("c:\t"+c);
        System.out.println("d:\t"+d);
    }
}
public class SimpleInheritance 
{
    public static void main(String[] args) 
    {
        Child c1=new Child();
        c1.display();        
    }
}
