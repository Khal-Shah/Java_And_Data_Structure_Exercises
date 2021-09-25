package Ch32_Multithreading_Parallel_Prog.ch32_notes.sect_5_thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_ThreadPools_Execution
{
    public static void main(String[] args)
    {
        //Use the PrintCharTask and PrintNumberTask classes from sect_3
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        PrintLetters printA = new PrintLetters('A', 100);
        PrintLetters printB = new PrintLetters('B', 100);
        PrintLetters printNumber = new PrintNums(100);

        executorService.execute(printA);
        executorService.execute(printNumber);
        executorService.execute(printB);

        System.out.println(executorService.isShutdown());
        executorService.shutdown();         //have to shut down or will keep running
        System.out.println(executorService.isShutdown());

    }



}
