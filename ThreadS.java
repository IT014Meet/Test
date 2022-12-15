
class Display
{
   public synchronized void Display1(String msg)
   {
        System.out.println("["+msg);
        try
        {
                Thread.sleep(100);
        }
        catch( Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("]");
   } 
class Threadp implements Runnable
{
    Thread p;
    String msg;
    Threadp target;
    Threadp(String s,Threadp m)
    {
        this.msg=s;
        target=m;
        p =new Thread(this);
        p.start();
    }
   public void run()
   {
        target.Display1(msg);
   }
}
   
}
public class ThreadS {
    
}
