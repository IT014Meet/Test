import java.awt.*;
import java.awt.event.*;
public class Thread1 extends Frame implements Runnable,ActionListener{
    Thread t;
    Button b;
    
    int x=200;
    int y=200;
    int dir=10;
    int dir1=10;
   
    public static void main(String[] args) {
        new Thread1("my thread");
        
    }
    Thread1(String s)
    {
        super(s);
        t=new Thread(this,s);
        setSize(400,400);
        setVisible(true);
        b=new Button("start");
        setLayout(new FlowLayout());
       
        add(b,"Right");
       
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand(); 
        if(s.equals("start"))
        {
            t.start();
        }
    }
    public void run()
    {
        try
        {
            while(true){
                
                t.sleep(50);
                
                x=x+dir;
                y=y+dir1; 
                
                if(x==0 ||   x==370){
                    dir=dir*-1;

                }
                if(y==50 || y==370)
                {
                    dir1=dir1*-1;
                }
              

                
                repaint();
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval( x+8, y+8,20,20);
        g.setColor(Color.GREEN);
        g.fillOval( x+10, y+10,16,16);
    }
   
}
