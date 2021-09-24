package ch32_notes.sect_3_4_creating_tasks_threads;

public class Demo2_JoinThreads
{
    public static void main(String[] args)
    {
        Runnable printEven = new PrintEvenNumberThread(200);
        Thread evenThread = new Thread(printEven);

//        Runnable printOdd = new PrintOddNumberThread(200);
//        Thread oddThread = new Thread(printOdd);

        evenThread.start();
//        oddThread.start();
    }
}

class PrintEvenNumberThread implements Runnable
{
    private int n;

    public PrintEvenNumberThread(int n)
    {
        this.n = n;
    }

    @Override
    public void run()
    {
        Runnable printOdd = new PrintOddNumberThread(200);
        Thread oddThread = new Thread(printOdd);
        oddThread.start();

        try
        {
            for(int i = 2; i <= this.n; i += 2)
            {
                System.out.print(i + "\t");
                if(i >= 50)
                {
                    oddThread.join();
                }
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}

class PrintOddNumberThread implements Runnable
{
    private int n;

    public PrintOddNumberThread(int n)
    {
        this.n = n;
    }

    @Override
    public void run()
    {
        for(int i = 1; i <= this.n; i += 2)
        {
            System.out.print(i + "\t");
        }
    }
}
