class One<T1 extends Number>
{   
    T1 a,b;
    One(T1 a,T1 b)
    {   this.a=a;
        this.b=b;
    }
    public String toString()
    {   return getClass().getName()+"@[a="+a+",b="+b+"]";
    }
    Float add()
    {   return a.floatValue()+b.floatValue();
    }
    Float sub()
    {   return a.floatValue()-b.floatValue();
    }
    Float multi()
    {   return a.floatValue()*b.floatValue();
    }
    Float div()
    {   return a.floatValue()/b.floatValue();
    }
    Float mod()
    {   return a.floatValue()%b.floatValue();
    }
}
class GenDemo1
{
    public static void main(String[] args) 
    {
        One<Integer> o1=new One<Integer>(10, 3);
        One<Float> o2=new One<Float>(100.90f,20.50f);
        System.out.println(o1);
        System.out.println(o2);
        System.err.println(o1.add());
        System.err.println(o1.sub());
        System.err.println(o1.multi());
        System.err.println(o1.div());
        System.err.println(o1.mod());
          
        // int i=10;
        // //boxing
        // Integer io=new Integer(i);
        // Integer io2=10;//autoboxing
        // //unboxing
        // int n=io.intValue(); //n=10
        // float f=io.floatValue();//f=10.00f
        // //Auto unboxing
        // int x=io;
    }
}