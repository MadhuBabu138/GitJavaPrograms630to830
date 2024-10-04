class One
{   int a,b;
    One()
    {   System.out.println("default constructor..");
    }
    One(int a)//a=100
    {   this();
        this.a=a;
        System.out.println("single param constructor..");
    }
    One(int a,int b)//a=100,b=200
    {   this(a); //this(100)
        this.b=b;
        System.out.println("double param constructor..");
    }
    void display()
    {
        System.out.println("object state...");
        System.out.println("a:\t"+a);
        System.out.println("b:\t"+b);
    }
}
public class ThisKeywordUsage 
{
    public static void main(String[] args) 
    {        
        One o1=new One(100,200);
        o1.display();
    }
}
