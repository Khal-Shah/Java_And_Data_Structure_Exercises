package ch19exercises.ex02_generic_stack_inheritance;

public class GenericStack_Driver
{
    public static void main(String[] args)
    {
        GenericStack<String> names = new GenericStack<>();
        names.push("Arya");
        names.push("Jon");
        names.push("Rob");
        names.push("Brandon");
        names.push("Sansa");

        System.out.println(names);

        System.out.println(names.search("Rob"));
        names.remove("Rob");
        System.out.println(names);
        names.push("RIP King of the North");
        System.out.println(names.peek());

        GenericStack<Double> numbers = new GenericStack<>();
        numbers.push(3.3);
        numbers.push(5.0);
        System.out.println(numbers);

    }
}
