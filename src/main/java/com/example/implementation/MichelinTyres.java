package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate(){
        return "Vehicle moving on Michelin tyres.";
    }

    @Override
    public String stop(){
        return "Vehicle stopped on Michelin tyres.";
    }
}
