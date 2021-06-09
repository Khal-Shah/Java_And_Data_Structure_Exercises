package ch13notes.Ch13_5_interfaces;

public interface Edible
{
    //describe how to eat
    String howToEat();

    static void main(String[] args)
    {
        //test edible
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};

        for(Object object : objects)
        {
            if(object instanceof Edible)
            {
                System.out.println(object.getClass().getSimpleName());
                System.out.println(((Edible) object).howToEat());
            }
        }
    }

}
