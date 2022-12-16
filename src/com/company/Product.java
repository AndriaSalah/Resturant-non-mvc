package com.company;

import java.util.ArrayList;

public class Product  {
    String dishName,type;

    public Product(String type,String dishName) {
        this.type = type;
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public String getType() {
        return type;
    }
}

