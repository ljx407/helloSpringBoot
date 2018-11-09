package com.ljx.springboot.datasource;

import java.util.Arrays;

public enum SexEnum {

    FEMALE(2,"女"),
    MALE(1,"男");

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getValue(String id) {
        return Arrays.stream(SexEnum.values())
                .filter(item -> String.valueOf(item.id).equals(id))
                .findFirst().orElseGet(null);
    }



    private int id ;
    private String name ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
