class Base
{   
    static int s=100;
    int a=10,b=20;
    void display(){
        System.out.println("Base class instance method display..");
    }
    static void fun1(){
        System.out.println("base class static method fun1.");
    }
    void fun2()
    {   System.out.println("Base instacnce method fun2");
    }
}
class Child extends Base
{
    static int s=1000;
    int a=100,b=200;
    @Override
    void display(){
        System.out.println("Child class instance method display..");
    }
    static void fun1(){
        System.out.println("Child class static method fun1.");
    }
    void fun3()
    {
        System.out.println("base class instance method fun3");
    }
}
public class UpDownCast
{
    public static void main(String[] args) 
    {
        Base b1=new Child();        //upcasting
        Child c1=(Child)b1;         //downcasting
        System.out.println("b1.s:\t"+ b1.s ); //100
        System.out.println("c1.s:\t"+ c1.s ); //1000
        System.out.println("b1.a:\t"+ b1.a ); //10
        System.out.println("c1.a:\t"+c1.a ); //100
        System.out.println("b1.b:\t"+ b1.b ); //20
        System.out.println("c1.b:\t"+c1.b ); //200
        b1.fun1();  //fun1 of Base
        c1.fun1(); //fun1 of Child

        b1.display();  //child display method (dynamic binding)
        c1.display();  //child display it is compile time binding

        b1.fun2();   //compile time
        c1.fun2();  //compile time

        int i=(int)100.00;

        ((Child)b1).fun3(); 
        c1.fun3();

        //Child c=(Child)new Base(); run time error
    }
}
