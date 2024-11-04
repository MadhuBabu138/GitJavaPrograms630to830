class Base
{   int a,b;
    Base(int a,int b) //parameterized constructor
    {   //a=100  b=200
        super(); //Base/super class constructor calling statement
        this.a=a; //this.a=10
        this.b=b; //this.b=20
    }
    void display()
    {   System.out.println("instance method of base class");
        System.out.println("a:\t"+a);
        System.out.println("b:\t"+b);
    }
}
class Child extends Base
{   int c,d;
    Child(int a,int b,int c,int d)
    {   super(a,b); //super class constructor calling
        this.c=c;  //this.c=30
        this.d=d; //this.d=40
    }
    void display()
    {   System.out.println("instance method of Child class");
        super.display();
        System.out.println("c:\t"+c);
        System.out.println("d:\t"+d);
    }
}
class SubChild extends Child
{
    int e,f;
    SubChild(int a,int b,int c,int d,int e,int f)
    {   
        super(a, b, c, d);
        this.e=e;
        this.f=f;
    }
    void display()
    {
        super.display();
        System.out.println("e:\t"+e);
        System.out.println("f:\t"+f);
    }
}
public class SimpleInheritance 
{
    public static void main(String[] args) 
    {
        // Child c1=new Child(100,200,300,400);
        // //c1 object state is 100,200,300,400
        // c1.display();        
        SubChild sc=new SubChild(100,200,300,400,500, 600);
        sc.display();
    }
}
