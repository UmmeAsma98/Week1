public class FiveThreadsUsingRunnable implements Runnable
{
    public void run()
    {
        try {

        System.out.println( Thread.currentThread().getId() + "is running");
        }
        catch(Exception e) {
            System.out.println("Exception is caught");
        }

    }

    public static void main(String[] args)
    {
        int i,n=5;
        System.out.println("HELLO INDIA");
        for(i=1;i<=n;i++)
        {
            FiveThreads f=new FiveThreads();
            f.start();
        }
    }
}

