package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Max");
        license.setModel("non");
        license.setCode("xx111x");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " dont has a car - " + license.getModel() + " : " + license.getCode());
    }
}
