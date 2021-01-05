package com.matthew.springcore.outsourced;

import com.matthew.springcore.dependencies.CarComponent;

public class Ferrari implements Car
{
    
    private CarComponent wheels;
    
    private CarComponent chassis;
    
    private CarComponent doors;
    
    
    // injecting 2 dependency objects using CONSTRUCTOR injection
    public Ferrari(CarComponent chassis, CarComponent doors)
    {
        this.chassis = chassis;
        this.doors = doors;
    }
    
    
    // injecting 1 dependency object using SETTER METHOD injection
    public void setWheels( CarComponent wheels )
    {
        
        this.wheels = wheels;
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
