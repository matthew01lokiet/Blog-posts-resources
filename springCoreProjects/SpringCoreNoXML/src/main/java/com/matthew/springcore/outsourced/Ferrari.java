package com.matthew.springcore.outsourced;

import com.matthew.springcore.dependencies.CarComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Ferrari implements Car
{
    @Autowired
    private Random randomLicensePlateNumber;
    
    private CarComponent wheels;
    
    private CarComponent chassis;
    
    @Autowired
    @Qualifier("doors")
    private CarComponent doors;
    
    
    // injecting 1 dependency object using CONSTRUCTOR injection
    @Autowired
    public Ferrari( @Qualifier("chassis")CarComponent chassis)
    {
        this.chassis = chassis;
    }
    
    
    // injecting 1 dependency object using SETTER METHOD injection
    @Autowired
    @Qualifier("wheels")
    public void setWheels( CarComponent wheels )
    {
        
        this.wheels = wheels;
    }
    
    
    @Override
    public Random getRandomLicensePlateNumber()
    {
        
        return this.randomLicensePlateNumber;
    }
    
    
    @Override
    public void startDriving()
    {
        
        System.out.println("Ferrari engine started, driving...");
    }
    
    @Override
    public void stop()
    {
        
        System.out.println("Ferrari engine stopped, parking...");
    }
    
    @Override
    public CarComponent getWheels()
    {
        
        return wheels;
    }
    
    @Override
    public CarComponent getChassis()
    {
        
        return chassis;
    }
    
    @Override
    public CarComponent getDoors()
    {
        
        return doors;
    }
    
}
