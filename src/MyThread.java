public class MyThread extends Thread{
    public void run()
    {
        System.out.println("My created thread name is MyThread");
    }
    public static void main(String args[])
    {
        MyThread m = new MyThread();
        m.start();
    }
}

