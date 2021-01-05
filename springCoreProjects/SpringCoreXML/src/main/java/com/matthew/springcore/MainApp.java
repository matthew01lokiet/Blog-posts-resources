package com.matthew.springcore;

import com.matthew.springcore.outsourced.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main(String... args)
    {
    
        // We load our "applicationContext.xml" file loading configuration and registering beans
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
        
        // We are retrieving bean from Spring Container by issuing
        /*
            
            context.getBean( id_of_the_bean_in_applicationContext.xml_ , _interface_or_class_type_of_the_bean )
            
         */
        Car ferrari = context.getBean( "ferrari", Car.class );
    
        
        // We are checking that dependencies have been injected
        System.out.println(ferrari.getChassis().carComponentName());
        System.out.println(ferrari.getDoors().carComponentName());
        System.out.println(ferrari.getWheels().carComponentName());
        
    }
}
