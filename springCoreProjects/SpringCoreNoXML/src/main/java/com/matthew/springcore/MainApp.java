package com.matthew.springcore;

import com.matthew.springcore.configuration.AppConfig;
import com.matthew.springcore.outsourced.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp
{
    public static void main(String... args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class);
        
        Car ferrari = context.getBean( "ferrari", Car.class );
        
        System.out.println(ferrari.getWheels().carComponentName());
        System.out.println(ferrari.getDoors().carComponentName());
        System.out.println(ferrari.getChassis().carComponentName());
        System.out.println(ferrari.getRandomLicensePlateNumber().nextInt(90000) + 10000);
    }
}
