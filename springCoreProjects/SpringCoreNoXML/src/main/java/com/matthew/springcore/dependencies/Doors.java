package com.matthew.springcore.dependencies;

import org.springframework.stereotype.Component;

@Component
public class Doors implements CarComponent
{
    
    @Override
    public String carComponentName()
    {
        
        return "Doors";
    }
    
}
