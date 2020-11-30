package ch13notes.Ch13_5_Interfaces;

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
