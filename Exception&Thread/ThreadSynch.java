class Shared 
{
    boolean track = true; 
}

class OThread extends Thread 
{
    Shared s;

    OThread(Shared s) 
    {
        this.s = s;
    }

    public void run() 
    {
        for (int i = 1; i <= 10; i += 2) 
        {
            while (true) 
            {
                synchronized (s) 
                {
                    if (s.track) 
                    {
                        System.out.println(i);
                        s.track = false;
                        break;
                    }
                }
            }
        }
    }
}

class EThread extends Thread 
{
    Shared s;

    EThread(Shared s) 
    {
        this.s = s;
    }

    public void run() 
    {
        for (int i = 2; i <= 10; i += 2) 
        {
            while (true) 
            {
                synchronized (s) 
                {
                    if (!s.track) 
                    {
                        System.out.println(i);
                        s.track = true;
                        break;
                    }
                }
            }
        }
    }
}

public class ThreadSynch 
{
    public static void main(String[] args) 
    {
        Shared s = new Shared();
        OThread o = new OThread(s);
        EThread e = new EThread(s);
        o.start();
        e.start();
    }
}
