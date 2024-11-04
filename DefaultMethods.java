import static java.lang.System.*;
interface Shape
{	void draw();
	default void display()
	{out.println("Default method of Shape interface");
	}
}
class Circle implements Shape
{	
    @Override
    public void draw()
	{out.println("Circle is drawn");
	}
	@Override	
	public void display()
	{out.println("Circle display method...");
	}
}
class Rectangle implements Shape
{	public void draw()
	{out.println("Rectangle is drawn");
	}	
}
class DefaultMethods
{	public static void main(String args[])
	{	Circle c=new Circle();
		Rectangle r=new Rectangle();
		c.draw();
		c.display();
		r.draw();
		r.display();
	}
}
