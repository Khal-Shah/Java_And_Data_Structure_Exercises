package ch9exercises.Ch9_08_Fan;

public class Fan
{
    final static int SLOW = 1;
    final static int MEDIUM = 2;                            //constants can be public
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    String color;                                                            //doesn't say private

    public Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    //mutator methods

    public void setSpeed(int newSpeed)
    {
        speed = (((newSpeed >= 1) && (newSpeed <= 3)) ? newSpeed : speed);
    }

    public void setState(boolean newState)
    {
        on = ((newState == true) || (newState == false) ? newState : on);
    }

    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }

    public void setColor(String newColor)
    {
        color = newColor;
    }

    //accessor methods

    public String getSpeed()
    {
        if (speed == SLOW)
        {
            return "slow";
        }

        else if (speed == MEDIUM)
        {
            return "medium";
        }

        else
        {
            return "fast";
        }
    }

    public boolean getState()
    {
        return on;
    }

    public double getRadius()
    {
        return radius;
    }

    public String getColor()
    {
        return color;
    }

    public String toString()
    {
        if (getState())
        {
            return ("Fan speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius());
        }

        else
        {
            return ("Fan is off.\nColor: " + getColor() + "\nRadius: " + getRadius());
        }
    }

}
