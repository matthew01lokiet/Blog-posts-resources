package com.matthew.springcore.dependencies;

import org.springframework.stereotype.Component;

@Component
public class Chassis implements CarComponent
{
    
    @Override
    public String carComponentName()
    {
        
        return "Chassis";
    }
    
}
