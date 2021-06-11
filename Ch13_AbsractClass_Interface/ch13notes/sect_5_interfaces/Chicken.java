package ch13notes.sect_5_interfaces;

class Chicken extends Animal implements Edible
{
    @Override
    public String howToEat()
    {
        return "Chicken: Fry it.";
    }

    @Override
    public String sound()
    {
        return "Chicken: cock-a-doodle-doo";
    }
}
