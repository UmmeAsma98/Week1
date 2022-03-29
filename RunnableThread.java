public class RunnableThread implements Runnable{
    public void run()
    {
        //System.out.println("thread is created as RunnableThread");
        System.out.println("Thread has been successfully created using Runnable interface");
    }
    public static void main(String[] args)
    {
        RunnableThread r = new RunnableThread();
        Thread t = new Thread(r);
        //t.start();
        System.out.println("Thread name is: RunnableThread");
        t.start();
    }
}
