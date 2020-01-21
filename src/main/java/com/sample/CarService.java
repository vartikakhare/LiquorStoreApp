package com.sample;

import com.sample.model.CarType;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<String> getAvailableBrands(CarType type){

        List<String> brands = new ArrayList<String>();

        if(type.equals(CarType.BMW)){
            brands.add("BMW X1");
            brands.add(("BMW X 4"));

        }else if(type.equals(CarType.AUDI)){
            brands.add("Q7");
            brands.add("Q8");

        }else if(type.equals(CarType.MARUTI)){
            brands.add("CIAZ");
            brands.add("S-Cross");

        }else {
            brands.add("No Brand Available");
        }
    return brands;
    }
}