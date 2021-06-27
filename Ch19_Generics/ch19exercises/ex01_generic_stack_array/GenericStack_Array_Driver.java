package ch19exercises.ex01_generic_stack_array;

public class GenericStack_Array_Driver
{
    public static void main(String[] args)
    {
        GenericStack_Array<Integer> nums = new GenericStack_Array<>(3);
        System.out.println("size: " + nums.getSize());

        nums.push(3);
        nums.push(4);
        nums.push(6);

        nums.displayStackBottomToTop();

        nums.pop();
        System.out.println("size: " + nums.getSize());
        nums.displayStackBottomToTop();

        nums.push(7);
        nums.push(22);
        System.out.println("size: " + nums.getSize());
        nums.displayStackBottomToTop();

        GenericStack_Array<String> names = new GenericStack_Array<>(2);
        names.push("Khal");
        names.push("Khaled");
        System.out.println("size: " + names.getSize());
        names.displayStackBottomToTop();

        names.push("Shah");
        names.push("Shaw");
        System.out.println("size: " + names.getSize());
        names.displayStackBottomToTop();

        names.push("B");
        System.out.println("size: " + names.getSize());
        names.displayStackBottomToTop();

        //names.push("Khal");

    }
}
