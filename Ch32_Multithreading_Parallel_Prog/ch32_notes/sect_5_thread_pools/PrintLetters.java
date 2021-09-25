package Ch32_Multithreading_Parallel_Prog.ch32_notes.sect_5_thread_pools;

public class PrintLetters implements Runnable
{
    private char letterToPrint;
    private int timesToPrint;

    public PrintLetters(char letter, int n)
    {
        this.letterToPrint = letter;
        this.timesToPrint = n;
    }

    public PrintLetters()
    {
    }

    @Override
    public void run()
    {
        try
        {
            for(int i = 1; i <= this.timesToPrint; i++)
            {
                System.out.print(this.letterToPrint + "\t");
                if(i % 10 == 0)
                {
                    System.out.println();
                    Thread.sleep(1000);
                }
            }
        }
        catch(InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}

class PrintNums extends PrintLetters implements Runnable
{
    private int n;

    public PrintNums(int n)
    {
        this.n = n;
    }

    @Override
    public void run()
    {
        try
        {
            for(int i = 1; i <= this.n; i++)
            {
                System.out.print(i + "\t");
                if(i % 10 == 0)
                {
                    System.out.println();
                    Thread.sleep(1000);
                }
            }
        }
        catch(InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}
