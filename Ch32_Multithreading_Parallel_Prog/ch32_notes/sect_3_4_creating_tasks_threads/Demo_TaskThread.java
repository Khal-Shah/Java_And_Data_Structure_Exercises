package ch32_notes.sect_3_4_creating_tasks_threads;

/*
Three tasks:
1) prints letter a 100 times
2) prints letter b 100 times
3) prints int 1 through 100
 */
public class Demo_TaskThread
{
    public static void main(String[] args)
    {
        //Create objects for tasks Classes then pass them to threads
        //Since task object classes implement Runnable, they are instances of Runnable
        Runnable printA = new PrintCharTask('a', 100);      //Runnable Task Object
        Runnable printB = new PrintCharTask('b', 100);
        Runnable printNumber = new PrintNumberTask(100);

        //Create threads for each of the task
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printNumber);
        System.out.println(thread2.isAlive());
        System.out.println(thread3.isAlive());

        //start threads
//        thread1.start();
//        thread2.start();
        thread3.start();
    }
}

//First & Second tread/task will print the characters
class PrintCharTask implements Runnable
{
    private char charToPrint;
    private int prinNTimes;

    public PrintCharTask(char c, int n)
    {
        this.charToPrint = c;
        this.prinNTimes = n;
    }

    //Override run() method to tell system what task to perform
    @Override
    public void run()
    {
        for(int i = 0; i < this.prinNTimes; i++)
        {
            System.out.print(this.charToPrint + "\t");
        }
        System.out.println();
    }
}

//last task/thread to print 1 through 100 (1 to n for given n)
class PrintNumberTask implements Runnable
{
    private int lastNum;

    public PrintNumberTask(int n)
    {
        this.lastNum = n;
    }

    @Override
    public void run()
    {
        try
        {
            for(int i = 1; i <= this.lastNum; i++)
            {
                System.out.print(i + "\t");

                if(i % 10 == 0)
                {
                    System.out.println();
                    Thread.sleep(1000);
                }
            }
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }

        //Thread.yield() will yield will pause current thread temporarily to let other threads
        // run (after it prints i each time).
//            Thread.yield();

    }
}
