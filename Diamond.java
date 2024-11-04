import static java.lang.System.*;
interface Inf1
{	default void display()	
	{out.println("Inf1 Default method");	
	}
}
interface Inf2
{	default void display()	
	{out.println("Inf2 Default method");	
	}
}
class Child1 implements Inf1,Inf2
{	
    @Override
    public void display()
    {
        Inf1.super.display();
    }
}
class Child2 implements Inf1,Inf2
{	
    @Override
    public void display()
    {
        Inf2.super.display();
    }
}
class Child3 implements Inf1,Inf2
{	
    @Override
    public void display()
    {
        Inf1.super.display();
        Inf2.super.display();
    }
}
class Child4 implements Inf1,Inf2
{	
    @Override
    public void display()
    {
        System.out.println("Child4 display method..");
    }
}
public class Diamond {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.display();
        Child2 c2=new Child2();
        c2.display();
        Child3 c3=new Child3();
        c3.display();
        Child4 c4=new Child4();
        c4.display();

    }
}
