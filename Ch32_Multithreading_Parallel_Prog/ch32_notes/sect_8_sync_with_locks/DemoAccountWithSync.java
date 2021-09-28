package Ch32_Multithreading_Parallel_Prog.ch32_notes.sect_8_sync_with_locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoAccountWithSync
{
    private static Account account = new Account();

    public static class Account
    {
        //create a lock
        private static Lock lock = new ReentrantLock();
        private int balance = 0;

        public int getBalance()
        {
            return this.balance;
        }

        public void deposit(int amount)
        {
//            use the lock
            lock.lock();    //Acquire the lock

            try
            {
                int newBalance = balance + amount;

                //Delay deliberately added to magnify the data-corruption problem
                Thread.sleep(5);
                balance = newBalance;
            }
            catch(InterruptedException exception)
            {
                exception.printStackTrace();
            }
            finally
            {
                lock.unlock();      //release the lock
            }
        }
    }

    //A thread for adding a penny to the account
    public static class AddPennyTask implements Runnable
    {
        @Override
        public void run()
        {
            account.deposit(1);
        }
    }

    public static void main(String[] args)
    {
        //create ExecutorService
        ExecutorService executorService = Executors.newCachedThreadPool();

        //create and launch 100 threads:
        for(int i = 0; i < 100; i++)
        {
            executorService.execute(new AddPennyTask());
        }
        //shutdown
        executorService.shutdown();

        //wait until all tasks are finished
        while(!executorService.isTerminated())
        {
        }

        System.out.println("The balance is: " + account.getBalance());
    }
}
