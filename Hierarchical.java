class Bird
{   
    private String name,breed,color,food;
    public Bird(String name,String breed,String color,String food)
    {   this.name=name;
        this.breed=breed;
        this.color=color;
        this.food=food;
    }
    public Bird()
    {   super();
        System.out.println("default constructor is invoked..");
        /*
         name=null;
         breed=null;
         color=null;
         food=null;
         */
    }
    public void fly()
    {   System.out.println(name+" can fly ");
    }
    public void eat()
    {   System.out.println(name+" eat  "+food+"  as food");
    }
    public void sing()
    {   System.out.println(name+" can't sing like humans ");
    }
    public void talk()
    {   System.out.println(name+" can't talk like humans ");
    }
    public String getName()//bird=1002
    {return name;  //  return bird.name;
    }
    public void setName(String name)//p1=1002
    {   this.name=name;
    }
    public String getBreed()//bird=1002
    {return breed;  //  return bird.name;
    }
    public void setBreed(String breed)//bird
    {   this.breed=breed;
    }
    public String getColor()//bird=1002
    {return color;  //  return bird.name;
    }
    public void setColor(String color)//bird
    {   this.color=color;
    }
    public String getFood()//bird=1002
    {return food;  //  return bird.name;
    }
    public void setFood(String food)//bird
    {   this.food=food;
    }
}
class Parrot extends Bird
{
    Parrot()
    {   super();
        System.out.println("Parrot is initialized..");
    }
    @Override //it is an annotation
    public void talk()
    {   System.out.println(getName()+" can talk like humans ");
    }
}
class Ostricth extends Bird{
    Ostricth()
    {   super();
        System.out.println("Ostricth initialized..");
    }
    @Override  //annotation
    public void fly()
    {   System.out.println(getName()+" can't fly ");
    }
}
public class Hierarchical 
{
    public static void main(String[] args) 
    {   Parrot p1=new Parrot();
        Ostricth o1=new Ostricth();
        //p1=1002
        //o1=2002
        //p1 object initialization using setter methods
        p1.setName("Parrot");
        p1.setBreed("Indian Parrot");
        p1.setColor("Green");
        p1.setFood("Gauva, seeds etc..");
        //o1 object initialization using setter methods
        o1.setName("Ostricth");
        o1.setBreed("African Ostrich");
        o1.setColor("Black & White");
        o1.setFood("Leaves,insects,lizards and seeds etc..");

        System.out.println("Behavour of parrot");
        p1.fly();
        p1.eat();
        p1.talk();
        p1.sing();

        System.out.println("Behavour of Ostrich");
        o1.fly();
        o1.eat();
        o1.talk();
        o1.sing();
        
    }    
}
