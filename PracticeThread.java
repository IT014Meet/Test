// thread inherit 


public class PracticeThread extends Thread{
    
    public void run()
    {
        try{
            for(int i=0;i<11;i++)
            {
                System.out.println(""+i);
                Thread.sleep(0);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(" "+e);
        }
        
    }
    public static void main(String[] args) {
         PracticeThread t=new PracticeThread();
         PracticeThread t1=new PracticeThread();
         t.start();
         t1.start();
        
    }
}
