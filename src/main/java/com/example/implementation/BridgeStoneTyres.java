package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate(){
        return "Vehicle moving on BridgeStone tyres.";
    }

    @Override
    public String stop(){
        return "Vehicle stopped on BridgeStone tyres.";
    }
}
