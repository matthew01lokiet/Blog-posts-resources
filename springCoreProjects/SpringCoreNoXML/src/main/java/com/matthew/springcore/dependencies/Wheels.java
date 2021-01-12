package com.matthew.springcore.dependencies;

import org.springframework.stereotype.Component;

@Component
public class Wheels implements CarComponent
{
    
    @Override
    public String carComponentName()
    {
        
        return "Wheels";
    }
    
}
