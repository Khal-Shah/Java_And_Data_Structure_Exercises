package Ch32_Multithreading_Parallel_Prog.ch32_notes.sect_6_thread_synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo_AccountWithoutSync
{
    //static instance of Account
    private static Account account = new Account();

    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();

        //create and launch 100 threads
        for(int i = 0; i < 100; i++)
        {
//            Runnable addPennyTask = new AddPennyTask();
            //submit task
            executorService.execute(new AddPennyTask());
        }

        executorService.shutdown();

        //wait until all tasks are finished
        while(!executorService.isTerminated())
        {
//            System.out.println("Waiting...");
        }
        System.out.println("What is balance?\n" + account.getBalance());
    }

    //static inner class for Account
    private static class Account
    {
        //initial balance 0
        private int balance = 0;

        public int getBalance()
        {
            return this.balance;
        }

        public void deposit(int amount)
        {
//            this.balance += amount;
            int newBalance = this.balance + amount;
            try
            {
                //Delay added to magnify the data-corruption problem and make it easy to see.
                Thread.sleep(5);
            }
            catch(InterruptedException exception)
            {
//                exception.printStackTrace();
            }
            this.balance = newBalance;
        }
    }

    //the add penny task as a static Runnable class
    private static class AddPennyTask implements Runnable
    {
        @Override
        public void run()
        {
            //penny: 1 cent, can use account object because it was declared static.
            account.deposit(1);
        }
    }
}
