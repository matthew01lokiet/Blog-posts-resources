package com.matthew.springcore.outsourced;

import com.matthew.springcore.dependencies.CarComponent;

import java.util.Random;

public interface Car
{
    void startDriving();
    
    void stop();
    
    CarComponent getWheels();
    CarComponent getDoors();
    CarComponent getChassis();
    Random getRandomLicensePlateNumber();
}
