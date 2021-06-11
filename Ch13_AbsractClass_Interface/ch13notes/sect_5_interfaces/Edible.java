package ch13notes.sect_5_interfaces;

public interface Edible
{
    //describe how to eat
    String howToEat();
    default String print() {
        return "test";
    }

    static void main(String[] args)
    {
        //test edible
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        Edible edible = new Apple();
        System.out.println(edible.howToEat());
        System.out.println(edible.print());

        for(Object o : objects)
        {
            if(o instanceof Edible)
            {
                System.out.println(o.getClass().getSimpleName());
                System.out.println(((Edible) o).howToEat());
            }

            if(o instanceof Animal)
            {
                System.out.println(o.getClass().getSimpleName());
                System.out.println(((Animal) o).sound());
            }
        }
    }

}
