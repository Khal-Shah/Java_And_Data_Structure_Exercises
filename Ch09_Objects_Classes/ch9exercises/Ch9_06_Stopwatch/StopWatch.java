package ch9exercises.Ch9_06_Stopwatch;

class StopWatch
{
    private long startTime;
    private long endTime;

    public StopWatch()
    {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime()
    {
        return startTime;
    }

    public long getEndTime()
    {
        return endTime;
    }

    //A method named start() that resets the startTime to the current time.
    public void start()
    {
        startTime = System.currentTimeMillis();
    }

    //A method named stop() that sets the endTime to the current time.
    public void stop()
    {
        endTime = System.currentTimeMillis();
    }

    //■ A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
    public long getElapsedTime()
    {
        return (endTime - startTime);
    }


}
