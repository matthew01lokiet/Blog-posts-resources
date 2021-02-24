package com.matthew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainComparable
{

    public static void main(String... args) {

        // list initialization
        List< Employee > employeeList = new ArrayList<>( Arrays.asList
                (
                        new Employee( "James", "Bond", 25, 15000 ),
                        new Employee( "Jack", "Sparrow", 37, 2500 ),
                        new Employee( "Jack", "Daniels", 37, 2500 )
                ));

        System.out.println("\nCollection before sorting: \n");

        // before sorting
        for( Employee emp : employeeList )
        {
            System.out.println( emp );
        }

        // sorting objects of Employee class, which implements Comparable interface,
        // by providing List<Employee> object
        Collections.sort(employeeList);

        System.out.println("\nCollection after sorting: \n");

        // after sorting
        for( Employee emp : employeeList )
        {
            System.out.println(emp);
        }

        //////////////////////////////////////////////////////////////////////////////////

        // no Collection, just simple array initialization
        Employee[] employees = {
                new Employee( "James", "Bond", 25, 15000 ),
                new Employee( "Jack", "Sparrow", 37, 2500 ),
                new Employee( "Jack", "Daniels", 37, 2500 )
        };

        System.out.println("\nArray before sorting: \n");

        // before sorting
        for( Employee emp : employees )
        {
            System.out.println(emp);
        }

        // sorting objects of Employee class, which implements Comparable interface,
        // by providing Employee[] object
        Arrays.sort(employees);

        System.out.println("\nArray after sorting: \n");

        // after sorting
        for( Employee emp : employees )
        {
            System.out.println(emp);
        }

    }
}
