package com.narayan.Java_How_To_Program;//package com.narayan.Java_How_To_Program.ATM_Class_Study;

import javax.swing.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class Main{

    public static long factorial(long number) {
        if (number <= 1) // test for base case
            return 1; // base cases: 0! = 1 and 1! = 1
        else // recursion step
            return number * factorial( number - 1 );
    } // end method factorial

    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo( BigInteger.ONE ) <= 0) // test base case
            return BigInteger.ONE; // base cases: 0! = 1 and 1! = 1
        else // recursion step
            return number.multiply(
                    factorial( number.subtract( BigInteger.ONE ) ) );
    }

    public static void main(String[] args) {
        // write your code here
/**************************************************************************************
 String firstNumber =JOptionPane.showInputDialog( "Enter First Number" );
 String  secondNumber = JOptionPane.showInputDialog( "Enter Second Number" );
 int number1 = Integer.parseInt( firstNumber );
 int number2 = Integer.parseInt( secondNumber );
 int sum = number1 + number2;
 JOptionPane.showMessageDialog(null,  "The sum of : "+ number1 + " And " +  number2 +
 "  is "  + sum, "HERE IS MY DIALOG " , 1);
 *************************************************************************************
 JFrame frame = new JFrame( "Drawing lines , rectangle and ovals" );
 frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 LinesRectsOvalsJPanel linesRectsOvalsJPanel =
 new LinesRectsOvalsJPanel();
 frame.add(linesRectsOvalsJPanel);
 frame.setSize( 400,200 );
 frame.setVisible( true );
 ******************************

 BigInteger TWENTY = BigInteger.valueOf( 20    );
 BigInteger FIFTY = BigInteger.valueOf( 50    );

 for (BigInteger counter=TWENTY;( counter.compareTo( FIFTY ) <= 0 ); counter = counter.add(BigInteger.valueOf( 1 )) ) {
 System.out.printf( "%d! = %-10d\n", counter, factorial( counter ) );
 System.out.printf( "%d! = %d\n", counter, factorial( counter ) );
 }
 **************************/
        String colors[]={"RED", "BLUE", "MAJENTA", "WHITE", "PINK", "YELLOW", "BLUE" , "VIOLET", "BLUE" , "INDIGO" , "BLUE"};
        List <String> list=new ArrayList <String>();
        for (String i : colors) list.add( i );
        String removeColors[]={"RED", "PINK", "WHITE"};
        List <String> removeList=new ArrayList <String>();
        for (String i : removeColors) removeList.add( i );
        System.out.println( "Array List : " );
        for (int i=0; i < list.size(); i++) {
            System.out.printf( ": \'%s\' :", list.get( i ) );
        }


        List newList = ((List) ((ArrayList) list).clone());

        for (int i=0; i < removeList.size(); i++)
            newList.remove( removeList.get( i ) );

        System.out.println( "Array List  AFTER remove : " );
        for (int i=0; i < newList.size(); i++) {
            System.out.printf( ": \'%s\' :", list.get( i ) );
        }

            List <String> intersect=list.stream()
                    .filter( removeList::contains )
                    .collect( Collectors.toList() );
            System.out.println( "\n Array List  AFTER  intersetct : " );
            for (int i=0; i < intersect.size(); i++) {
                System.out.printf( ": \'%s\' :", intersect.get( i ) );
            }

        List< String > linkedList = new LinkedList< String >();
        for (String i : colors) linkedList.add( i );
        System.out.println("\nLinked list : " + linkedList);
        ListIterator< String > iterator = linkedList.listIterator();
        while ( iterator.hasNext()) {
            System.out.print( iterator.next()+"," );
        }
        System.out.println("\nLinked list in REVERSE ORDER : ");

        while ( iterator.hasPrevious()) {
            System.out.print( iterator.previous()+"," );
        }

        Collections.sort( list , Collections.reverseOrder());
        //Collections.reverse( list );
        System.out.println("\nSorted  list in : "  + list);

        Set< String > set = new HashSet< String >( list );

        System.out.println("\nMy SET are  : "  + set);

        Map< String, Integer > myMap = new HashMap< String, Integer >();
        for (int i=0; i < list.size(); i++) {
            if ( myMap.containsKey( list.get(i) )) {
                int cnt=myMap.get( list.get( i ) );
                myMap.put(list.get(i), ++cnt);
            }
            else
           myMap.put( list.get(i) , 1);
        }
        Set< String > keys = myMap.keySet(); // get keys
        TreeSet< String > sortedKeys = new TreeSet< String >( keys );
        for ( String  key : sortedKeys ) {
            System.out.printf(" %s   %s ", key , myMap.get(key));

        }
        System.out.printf(
                 "\nsize: %d\nisEmpty: %b\n", myMap.size(), myMap.isEmpty()  );

        Integer[] intArray = { 1, 2, 3, 4, 5 };
         Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
         Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        OverloadedMethods. printArra( colors);
        OverloadedMethods. printArra( charArray);

        System.out.printf( "Maximum of %d, %d and %d is %d\n\n", 3, 6 , 9 ,
                OverloadedMethods.maximum( 3 , 6 , 9 ) );
        System.out.printf( "Maximum of %d, %d and %d is %d\n\n", 3, 6 , 9 ,
                OverloadedMethods.maximume( 3 , 6 , 9 ) );
         myTree <Integer> tree = new myTree <Integer>(  );
         int value;
         Random randomNumber = new Random(  );
         System.out.println( "Inserting data in mytree" );
         for ( int i = 0 ; i<=10 ; i++) {
             value=randomNumber.nextInt( 100 );
             System.out.printf( " %s ", value );
             tree.insertNode( value );
         }

         System.out.println( "Pre Order Traversal" );
         tree.PreOrderTraversal();



    } // End of main()
}  // End of Main

