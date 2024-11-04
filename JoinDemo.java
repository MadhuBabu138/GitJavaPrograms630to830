class One extends Thread
{   @Override
    public void run()
    {   for(int i=1;i<=10;i++)
        {   System.out.println(getName()+"\t"+i);
        }
    }
}
class JoinDemo
{
    public static void main(String[] args) throws InterruptedException
    {   
        Thread mt=Thread.currentThread();
        System.out.println(mt.getName()+" Thread is started....");
        One t1=new One();
        t1.start();
        t1.join();
        System.out.println(mt.getName()+" Thread Ends here....");
    }
}