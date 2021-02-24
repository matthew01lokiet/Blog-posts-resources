package com.matthew;

public class Employee implements Comparable<Employee>
{
    private String name;
    private String lastName;
    private int age;
    private int salary;


    public Employee( String name, String lastName, int age, int salary )
    {

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    // method of 'Comparable<T>' interface that we must to implement
    @Override
    public int compareTo( Employee employee )
    {

        // compare names lexicographically
        int compNames = this.getName().compareTo( employee.getName() );

        // if they are not the same, return
        if(compNames != 0 )
        {
            return compNames;
        }
        else
        {
            // compare salaries values
            int compSalaries = this.getSalary() - employee.getSalary();

            // if they are not the same, return
            if(compSalaries != 0)
                return compSalaries;
            else
            {
                // compare age values
                int compAge = this.getAge() - employee.getAge();

                // if they are not the same, return
                if(compAge != 0)
                    return compAge;
                else
                {
                    // compare last names lexicographically
                    int compLastNames = this.getLastName().compareTo( employee.getLastName() );

                    // if they are not the same, return
                    if(compLastNames != 0)
                        return compLastNames;

                }
            }
        }

        // if we have reached this point, it means that all objects values are equal
        return 0;
    }


    // default getters and 'toString' method for printing objects
    public String getName()
    {

        return name;
    }


    public String getLastName()
    {

        return lastName;
    }


    public int getAge()
    {

        return age;
    }


    public int getSalary()
    {

        return salary;
    }


    @Override
    public String toString()
    {

        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
