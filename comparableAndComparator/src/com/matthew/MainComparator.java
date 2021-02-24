package com.matthew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainComparator
{
    public static void main(String... args)
    {
        // list initialization
        List< Employee > employeeList = new ArrayList<>( Arrays.asList
                (
                        new Employee( "James", "Bond", 25, 15000 ),
                        new Employee( "James", "Daniels", 37, 2500 ),
                        new Employee( "Jack", "Daniels", 25, 2500 )
                ));

        System.out.println("\nBefore sorting:\n");

        // before sorting
        for( Employee emp : employeeList )
        {
            System.out.println( emp );
        }

        System.out.println();

        ///////////////////////////////////////////////

        sortByLastNameAndFirstName( employeeList );
        System.out.println("Sorted by last name and first name alphabetically:\n");

        // after sorting 'sortByLastNameAndFirstName'
        for( Employee emp : employeeList )
        {
            System.out.println( emp );
        }

        System.out.println();

        ///////////////////////////////////////////////

        sortBySalaryAndAge( employeeList );
        System.out.println("Sorted by salary and age:\n");

        // after sorting 'sortBySalaryAndAge'
        for( Employee emp : employeeList )
        {
            System.out.println( emp );
        }

        System.out.println();

        ///////////////////////////////////////////////

        sortBySalaryAndAgeDescending( employeeList );
        System.out.println("Sorted by salary and age in descending order:\n");

        // after sorting 'sortBySalaryAndAgeDescending'
        for( Employee emp : employeeList )
        {
            System.out.println( emp );
        }

        System.out.println();


    }


    private static void sortByLastNameAndFirstName(List<Employee> employeeList)
    {
        // sorted with lambda expression, which uses 'Comparator' functional interface
        // sorted by last name and first name (in this order) alphabetically
        Collections.sort( employeeList, (emp1, emp2) ->{

            int compLastNames = emp1.getLastName().compareTo( emp2.getLastName() );

            if( compLastNames != 0)
                return compLastNames;
            else
                return emp1.getName().compareTo( emp2.getName() );

        } );
    }


    private static void sortBySalaryAndAge(List<Employee> employeeList)
    {
        // sorted with lambda expression, which uses 'Comparator' functional interface
        // sorted by salary and age (in this order) by comparing values
        Collections.sort(employeeList, (emp1, emp2) ->{

            int compSalaries = emp1.getSalary() - emp2.getSalary();

            if( compSalaries != 0)
                return compSalaries;
            else
                return emp1.getAge() - emp2.getAge();

        });
    }


    private static void sortBySalaryAndAgeDescending(List<Employee> employeeList)
    {
        // sorted with lambda expression, which uses 'Comparator' functional interface
        // sorted by salary and age in descending order
        Collections.sort(employeeList, (emp1, emp2) ->{

            int compSalaries = emp1.getSalary() - emp2.getSalary();

            // Only change -> inverse returned value by multiplying with -1
            if( compSalaries != 0)
                return compSalaries * (-1);
            else
                return (emp1.getAge() - emp2.getAge())*(-1);

        });
    }
}
