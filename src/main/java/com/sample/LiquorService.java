package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

public class LiquorService {

    public List<String> getAvailableBrands(LiquorType type){

        List<String> brands = new ArrayList<String>();

        if(type.equals(LiquorType.BMW)){
            brands.add("BMW X1");
            brands.add(("BMW X 4"));

        }else if(type.equals(LiquorType.AUDI)){
            brands.add("Q7");
            brands.add("Q8");

        }else if(type.equals(LiquorType.MARUTI)){
            brands.add("CIAZ");
            brands.add("S-Cross");

        }else {
            brands.add("No Brand Available");
        }
    return brands;
    }
}