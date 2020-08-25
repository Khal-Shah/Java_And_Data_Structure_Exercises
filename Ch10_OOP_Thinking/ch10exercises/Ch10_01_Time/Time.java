package ch10exercises.Ch10_01_Time;

public class Time
{
    private long hour;
    private long minute;
    private long second;
    static final int GMT_OFFSET = -4;              //Currently GMT -4 in Montreal, Canada

    public Time()
    {
        long totalSec = System.currentTimeMillis() / 1000;
        this.second = totalSec % 60;
        long totalMin = totalSec / 60;                //60sec = 1 min
        this.minute = totalMin % 60;
        long totalHr = totalMin / 60;                    //60 min = 1 hr
        this.hour = (totalHr % 24) + GMT_OFFSET;

        if (hour < 0)
        {
            hour += 24;
        }

        else if (hour > 24)
        {
            hour = -24;
        }
    }

    Time(long elapsedTime)
    {
        long totalSec = elapsedTime / 1000;         //1000ms = 1sec
        this.second = totalSec % 60;
        long totalMin = totalSec / 60;                //60sec = 1 min
        this.minute = totalMin % 60;
        long totalHr = totalMin / 60;                    //60 min = 1 hr
        this.hour = (totalHr % 24) + GMT_OFFSET;

        if (hour < 0)
        {
            hour += 24;
        }

        else if (hour > 24)
        {
            hour = -24;
        }
    }

    Time(long hour, long minute, long second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    long getHour()
    {
        if (hour < 0)
        {
            return hour + 24;
        }

        else if (hour > 24)
        {
            return hour - 24;
        }
        return hour;
    }

    long getMinute()
    {
        return minute;
    }

    long getSecond()
    {
        return second;
    }

    //■ A method named setTime(long elapseTime) that sets a new time
    //for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, the
    //minute is 19, and the second is 10.
    void setTime(long elapseTime)
    {
        long totalSec = elapseTime / 1000;         //1000ms = 1sec
        second = totalSec % 60;
        long totalMin = totalSec / 60;                //60sec = 1 min
        minute = totalMin % 60;
        long totalHr = totalMin / 60;                    //60 min = 1 hr
        hour = totalHr % 60;
    }

    public void showTime12HR()
    {
        System.out.printf("The current time is %d:" + ((minute < 10) ? "0" : "") + "%d:" + ((second < 10) ? "0" : "")
                          + "%d " + ((hour > 12) ? "PM" : "AM") + "\n",
                          ((hour % 12 == 0) ? (hour % 12) + 12 : hour % 12), minute, second);
    }

    public void showTime24HR()
    {
        System.out.printf("The current time is %d:" + ((minute < 10) ? "0" : "") + "%d:" + ((second < 10) ? "0" : "")
                          + "%d\n", hour, minute, second);
    }

}
