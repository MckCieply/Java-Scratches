package com.mckcieply;

import java.util.ArrayList;

public class ArrayFlipper {

    public <T> ArrayList<T> flipArrayList(ArrayList<T> inputArray){
        ArrayList<T> outputArray = new ArrayList<>();
        for(int i = inputArray.size() - 1; i >= 0; i--){
            outputArray.add(inputArray.get(i));
        }
        return outputArray;
    }
}
