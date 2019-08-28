package com.narayan.Java_How_To_Program;

@SuppressWarnings("ALL")
public class OverloadedMethods{

    public static void printArray( Integer[] inputArray)
    {
        for ( Integer element : inputArray)
            System.out.format( "%s ", element );

        System.out.println();
    }
    public static void printArray( String[] inputArray)
    {
        for ( String element : inputArray)
            System.out.format( "%s ", element );

        System.out.println();
    }
    public static void printArray( double[] inputArray)
    {
        for ( double element : inputArray)
            System.out.format( "%s ", element );

        System.out.println();
    }

    public static <E, F>  void printArra ( E[] inputArray)
    {
        for ( E element : inputArray)
            System.out.printf( "%s ", element );



        System.out.println();
    }
    public static < T extends Comparable< T > > T maximum( T x, T y, T z )
    {
         T max = x;
         if ( y.compareTo( max ) > 0  ) max = y;
         if ( z.compareTo( max ) > 0) max = z;


        return (T) max;
    }
    public static Comparable maximume( Comparable x, Comparable y, Comparable z )
    {
        Comparable max = x;
        if ( y.compareTo( max ) > 0  ) max = y;
        if ( z.compareTo( max ) > 0) max = z;


        return (Comparable) max;
    }
}
