package ch19notes.sect_3_4_generic_classes_methods;

import java.util.ArrayList;

public class Generic_Method
{
    public Generic_Method()
    {

    }

    public static <E> E print()
    {
//        for(E e: list)
//        {
//            System.out.println(e);
//        }
//        System.out.println(list);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("From print method");
        return (E) arrayList;
    }

    public static void main(String[] args)
    {
//        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Landry", "Patricia", "Neil", "Austin"};

        //way 1 of invoking generic method (is the same as normal)
//        print(names);

        //way 2: by using the class name along with prefix for the actual type
//        Generic_Method.<Integer>print(numbers);
        //explicit type arguments can be inferred so we can do it as way 3 (or 1)

        //way 3:
//        Generic_Method.print(names);

        //removing static and attempting to call it from instance
//        Generic_Method genericMethod = new Generic_Method();
//        genericMethod.print(names);
//
//        Integer intOb = 3;
//        print(intOb);
//        int num = 2;
//        print(num);
        ArrayList newList = print();
        System.out.println(newList);
    }
}
