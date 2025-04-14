import java.util.Random;
class Generator extends Thread
{
    public int n;
    public boolean track;
    synchronized public void run()
    {
        Random r1=new Random();
        for(int i=0;i<10;i++)
        {
            n=r1.nextInt(10);
            if(n%2==0)
            {
                track=true;
            }
            else
            {
                track=false;
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}
class OddThread extends Thread
{
    Generator g1;
    OddThread(Generator g1)
    {
        super();
        this.g1=g1;
    }
    synchronized public void run()
    {
        for(int i=0;i<10;i++)
        {
            int num=g1.n;
            if(num!=0&&g1.track==false)
            {
                while(g1.track==true);
                System.out.println("The cube of "+num+" : "+Math.pow(num,3));
                //g1.track=true;
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}
class EvenThread extends Thread
{
    Generator g1;
    EvenThread(Generator g1)
    {
        super();
        this.g1=g1;
    }
    synchronized public void run()
    {
        for(int i=0;i<10;i++)
        {
            int num=g1.n;
            if(num!=0&&g1.track==true)
            {
                while(g1.track==false);
                System.out.println("The square of " +num+" : " +Math.pow(num,2));
                //g1.track=false;
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}
public class Multithread 
{
    public static void main(String args[])
    {
        Generator g=new Generator();
        OddThread o1=new OddThread(g);
        EvenThread e1=new EvenThread(g);
        g.start();
        o1.start();
        e1.start();
    }
}
