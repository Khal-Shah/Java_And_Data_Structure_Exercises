package ch13notes.sect_5_interfaces;

abstract class Animal
{
    //return animal sound
    public abstract String sound();
}

class Test1 {
    String test(){
        return "Test1";
    }
}

abstract class Test2 extends Test1{
    @Override
    abstract String test();
}
