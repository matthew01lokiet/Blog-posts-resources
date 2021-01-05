package com.matthew.springcore.outsourced;

import com.matthew.springcore.dependencies.CarComponent;

public interface Car
{
    void startDriving();
    
    void stop();
    
    CarComponent getWheels();
    CarComponent getDoors();
    CarComponent getChassis();
}
