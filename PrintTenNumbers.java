import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
public class PrintTenNumbers  implements Runnable
{
    public void run()
    {
        System.out.println(" TEN NUMBERS ARE PRINTING USIN FIXEDTHREADPOOL OF SIZE 5:");
        for (int i=1;i<=10;i++)
        {
            //System.out.println("10 NUMBERS ARE PRINTING");
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        for(int i=1;i<=5;i++)
        {
            PrintTenNumbers ptn=new PrintTenNumbers();
            executor.execute(ptn);
        }
        executor.shutdown();
    }
}
