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

    public int[] flipArrayInteger(int[] inputArray){
        int[] outputArray = new int[inputArray.length];
        for(int i = inputArray.length - 1, j = 0; i >= 0; i--, j++){
            outputArray[j] = inputArray[i];
        }
        return outputArray;
    }

}
