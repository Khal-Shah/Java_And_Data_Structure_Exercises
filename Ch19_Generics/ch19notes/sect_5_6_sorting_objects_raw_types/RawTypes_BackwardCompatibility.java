package ch19notes.sect_5_6_sorting_objects_raw_types;

public class RawTypes_BackwardCompatibility
{
    //max method with no generics (raw types)
    public static Comparable maxNoGeneric(Comparable o1, Comparable o2)      //o1 and o2 here are raw type declarations
    {
        return ((o1.compareTo(o2) > 0)? o1 : o2);
    }

    //.max(23, "welcome") would be a runtime error

    //Now writing the same max method with generic type (better)
    public static <E extends Comparable<E>> E max(E o1, E o2)
    {
        return ((o1.compareTo(o2) > 0)? o1 : o2);
    }

    public static void main(String[] args)
    {
        System.out.println(RawTypes_BackwardCompatibility.maxNoGeneric(23, "welcome"));     //runtime error (noGeneric)

//        System.out.println(RawTypes_BackwardCompatibility.max(23, "welcome"));      //compile-time error (generic)

        System.out.print(RawTypes_BackwardCompatibility.maxNoGeneric(20, 22));     //works because both same type

    }
}
