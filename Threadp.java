public class Threadp implements Runnable
{
    // Thread t;
    // Threadp(String tt){
    //     // t = new Thread(this,tt);
    //     //  t.setName(tt);
    //     // t.start();
    // }
    public void run()
    {
        try{
            for(int i=0;i<10;i++)
            {
                System.out.println(i+" thread name:" );
                Thread.sleep(100);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

        public static void main(String[] args) {
            Thread t=new Thread();
            t.start();
            try{
                for(int i=0;i<10;i++)
                {
                    
                    System.out.println(i+" thread name: main thread" );
                    Thread.sleep(100);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
}